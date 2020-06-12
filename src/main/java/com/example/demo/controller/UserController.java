package com.example.demo.controller;


import com.example.demo.domain.*;
import com.example.demo.service.AdminService;
import com.example.demo.service.InstitutionService;
import com.example.demo.service.UserService;
import com.example.demo.util.*;
import net.sf.json.JSONObject;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private InstitutionService institutionService;
    @Autowired
    private RestTemplate restTemplate;

    /*
     **返回标准的Json格式数据其中包括（是否成功、状态码、消息、内容）
     * 该方法是由于公司很多童鞋写接口时没有一个标准的定义，天马行空的编写数据接口导致调用时效率极低，因此自己写了一个标准的
     * 接口调用方法，仅供大家参考
     * @param statu
     * @param code
     * @param message
     * @author lgf
     * */
    @RequestMapping("/getAllUser")
    @ResponseBody
    private List<UserDo> getAllUser(HttpServletResponse response) throws Exception {
        List<UserDo> allUser = userService.selectAll();
        return allUser;
    }


    /*
     **登录调用方法跳转登录页面
     * @author lgf
     * */
    @RequestMapping("/login")
    private String index() {
        out.println("yes");
        return "login-simple.html";
    }


    /*
     **登录成功响应方法
     * @param message
     * @author lgf
     * */
    @RequestMapping(value = "/success", method = {RequestMethod.POST, RequestMethod.GET})
    private String ok() {
        return "success";
    }

    /**
     * 用户登录
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    private R userLogin(String username, String password, HttpServletRequest request) {
        String token = "";
        UserDo user = userService.selectUserByUserName(username);
        password = Md5.getMD5(password);
        if (null == user) {
            return R.error("用户名不存在，请重试！");
        } else if (!user.getPassword().equals(password))
            return R.error(-200, "密码或用户名错误！");
        else if (user.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            if (user.getUserStatus() == 0)
                return R.error("该用户未审核！");
            else if (user.getUserStatus() == -1) {
                session.setAttribute("users", user);
                return R.error(-2, "该用户未审核通过！原因：" + user.getRemark());
            }


            List<AdminDo> list = adminService.selectAll();
            boolean sign = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(username)) {
                    sign = true;
                    break;
                }
            }

            UserDo userDo = userService.selectUserByUserName(username);
            if (null == userDo.getInstitutionName())
                return R.error(-1, "请补充管理员信息");
//                HttpRes httpRes = this.restTemplate.postForObject("http://47.105.220.31:4000/users","username=Admin&orgName=Org1", HttpRes.class);
//                out.println(httpRes.getsuccess());
//                out.println(httpRes.getMessage());
            JSONObject jsonObject;
            if (sign)
                jsonObject = JSONObject.fromObject(HttpRequestTool.sendPost("http://47.105.220.31:4000/users", "username=Admin&orgName=Org1", ""));
            else
                jsonObject = JSONObject.fromObject(HttpRequestTool.sendPost("http://47.105.220.31:4000/users", "username=" + username + "&orgName=Org1", ""));
            out.println(token);
            token = jsonObject.get("token").toString();
            session.setAttribute("token", token);
            session.setAttribute("userID", user.getId());
            session.setAttribute("userType", user.getUserType());
            return R.ok(user.getUserType().toString() + "," + token + "," + user.getInstitutionType() + "," + user.getUserType() + "," + user.getRemarks() + "," + user.getUsername() + "," + user.getIdCard());
        }

        return R.error("未知错误请重试！");

    }


    /**
     * 登陆成功跳转主界面
     *
     * @return
     */
    @RequestMapping("/toindex")
    private String toindex() {
        return "index.html";
    }

    /**
     * 跳转注册界面
     *
     * @return
     */
    @RequestMapping("/register")
    private String register(HttpServletRequest request) {
        List<AdminDo> list = adminService.selectAll();
        HttpSession session = request.getSession();
        session.setAttribute("admin", list);
        return "register-simple.html";
    }

    /**
     * 跳转管理员注册界面
     *
     * @return
     */
    @RequestMapping("/toAdminRegister")
    private String toAdminRegister(HttpServletRequest request) {
        List<AdminDo> list = adminService.selectAll();
        HttpSession session = request.getSession();
        session.setAttribute("admin", list);
        return "admin-register-simple.html";
    }

    /**
     * 返回admin列表
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getadmin")
    private List<AdminDo> getadmin() {
        List<AdminDo> list = adminService.selectAll();
        return list;
    }

    /**
     * 进入用户审核界面
     *
     * @return
     */
    @RequestMapping("/toUserReview")
    private String toUserReview(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer id;
        if (session.getAttribute("userID") == null) {
            return "forbid.html";
        } else {
            id = Integer.parseInt(session.getAttribute("userID").toString());
        }

        if (id == null)
            return "forbid.html";
        UserDo userDo = userService.selectUserByID(id);
        if (null == userDo || userDo.getUserType() != 3)
            return "forbid.html";
        return "user_review.html";
    }

    /**
     * 返回相对应的机构名称
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getinsName", method = RequestMethod.POST)
    private R getinsName(String institutionNumber) {
        System.out.println(institutionNumber);
        //int num = Integer.parseInt(institutionNumber);
        InstitutionDo institutionDo = institutionService.selectByID(institutionNumber);
        System.out.println(institutionDo);
        if (institutionDo == null)
            return R.error("机构编号不存在！");
        else
            return R.ok(institutionDo.getInstitutionName() + ',' + institutionDo.getInstitutionType());
    }

    /**
     * 用户注册
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    private R userRegister(@RequestBody UserDo user) {

        //UserDo user=(UserDo) JSONObject.toBean(json, UserDo.class);
        out.println(user.getIdCard());

        if (IdCardUtil.isValidatedAllIdcard(user.getIdCard()))
            return R.error("身份证号不合法，请重新注册！");

        //格式判断
        if (null == user.getUsername() || null == user.getPassword() || null == user.getIdCard() || null == user.getUserType()
                || null == user.getInstitutionNumber() || null == user.getInstitutionType() || null == user.getInstitutionName())
            return R.error("字段缺失，请重新注册！");

        //用户判断
        UserDo us = userService.selectUserByUserName(user.getUsername());
        if (null != us)
            return R.error("该用户名已存在！");

        //机构判断
        InstitutionDo institutionDo = institutionService.selectByID(user.getInstitutionNumber());

        if (null == institutionDo)
            return R.error("该机构不存在！");
        else if (!institutionDo.getInstitutionName().equals(user.getInstitutionName()))
            return R.error("机构编号与机构名称不符！");
        else if ("1" == institutionDo.getisInvalid())
            return R.error("该机构已被取消资格！");

        //管理员字段判断
        List<AdminDo> list = adminService.selectAll();
        boolean sign = false;

        if (user.getUserType() == 3) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(user.getUsername())) {
                    sign = true;
                    break;
                }
            }
            if (!sign)
                return R.error("该用户非预设管理员账号，请勿进行此操作！");
        }
        if (user.getUserType() == 3)
            user.setUserStatus(1);
        else
            user.setUserStatus(0);
        user.setPassword(Md5.getMD5(user.getPassword()));
        userService.insertUser(user);
        return R.ok("恭喜您，注册成功！");
    }

    /**
     * 管理员用户注册
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/adminRegister", method = RequestMethod.POST)
    private R adminRegister(@RequestBody JSONObject json) {
        UserDo user = (UserDo) JSONObject.toBean(json, UserDo.class);
        out.println(user.getIdCard());
        //格式判断
        if (null == user.getUsername() || null == user.getIdCard() || null == user.getUserType()
                || null == user.getInstitutionNumber() || null == user.getInstitutionType() || null == user.getInstitutionName())
            return R.error("字段缺失，请重新填写信息！");

        //用户判断
        UserDo us = userService.selectUserByUserName(user.getUsername());
        if (null == us)
            return R.error("不存在该管理员用户！");

        //机构判断
        InstitutionDo institutionDo = institutionService.selectByID(user.getInstitutionNumber());
        out.println(user.getInstitutionNumber());
        if (null == institutionDo)
            return R.error("该机构不存在！");
        else if (!institutionDo.getInstitutionName().equals(user.getInstitutionName()))
            return R.error("机构编号与机构名称不符！");
        List<AdminDo> list = adminService.selectAll();
        boolean sign = false;
        out.println(user.getUserType());
        if (user.getUserType() == 3) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getUsername().equals(user.getUsername())) {
                    sign = true;
                    break;
                }
            }
            if (!sign)
                return R.error("该用户非预设管理员账号，请勿进行此操作！");
        }
        if (user.getUserType() == 3)
            user.setUserStatus(1);
        else
            user.setUserStatus(0);
        user.setUserType(3);
        userService.updateAdmin(user);
        return R.ok("管理员信息补充完成，请返回登录！");
    }

    /**
     * 获得审核列表
     */
    @ResponseBody
    @RequestMapping(value = "/getRevList", method = RequestMethod.GET)
    private List<UserDo> getRevList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<UserDo> list = null;
        int id = Integer.parseInt(session.getAttribute("userID").toString());
        UserDo userDo = userService.selectUserByID(id);
        if (null == userDo || userDo.getUserType() != 3)
            list = null;
        else {
            list = userService.getByInstType(userDo.getInstitutionType());

        }
        return list;
    }

    /**
     * 获得审核成功列表
     */
    @ResponseBody
    @RequestMapping(value = "/getOKRevList", method = RequestMethod.GET)
    private List<UserDo> getOKRevList(HttpServletRequest request) {
        HttpSession session = request.getSession();
        List<UserDo> list = null;
        int id = Integer.parseInt(session.getAttribute("userID").toString());
        UserDo userDo = userService.selectUserByID(id);
        if (null == userDo || userDo.getUserType() != 3)
            list = null;
        else {
            list = userService.getOKByInstType(userDo.getInstitutionType());
        }
        return list;
    }

    /**
     * 用户审核成功
     *
     * @param id
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/reviewSuccess", method = RequestMethod.GET)
    private R reviewSuccess(int id, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int adminid = Integer.parseInt(session.getAttribute("userID").toString());
        UserDo adminuser = userService.selectUserByID(adminid);
        UserDo user = userService.selectUserByID(id);
        if (null == user || user.getUserStatus() != 0) {
            return R.error("被审核者不存在或已被审核！");
        }
        //if(adminuser.getUserType()!=3 || !user.getInstitutionType().equals(adminuser.getInstitutionType()))
        if (!user.getInstitutionType().equals(adminuser.getInstitutionType()))
            return R.error("权限错误,您当前无此权限！");
        else {

            UserDo nUser = userService.selectUserByID(id);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("peers", new String[]{"peer0.org1.example.com", "peer0.org2.example.com", "peer0.org3.example.com"});
            jsonObject.put("fcn", "userRegistration");
            jsonObject.put("args", new String[]{nUser.getInstitutionNumber().toString(), nUser.getInstitutionType(), nUser.getUserType().toString(), nUser.getIdCard().split(";")[0]
                    , nUser.getUsername()});
            out.println(jsonObject);
//            HttpRes httpRes = this.restTemplate.postForObject("http://47.105.220.31:4000/channels/mychannel/chaincodes/mycc",jsonObject, HttpRes.class);
//            out.println(httpRes.getMessage());
//            out.println(httpRes.getsuccess());
            String token = session.getAttribute("token").toString();
            JSONObject jsonObject1 = JSONObject.fromObject(HttpRequestTool.sendPost("http://47.105.220.31:4000/channels/mychannel/chaincodes/mycc", jsonObject.toString(), token));
            String ids = jsonObject1.getString("message");
            String[] idd = ids.split(":");
            String i = idd[1].substring(1, idd[1].length());
            out.println(i);
            userService.updateState(id, 1, "无", i);

            JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("peers", new String[]{"peer0.org1.example.com", "peer0.org2.example.com", "peer0.org3.example.com"});
            jsonObject2.put("fcn", "userAudit");
            jsonObject2.put("args", new String[]{user.getIdCard().split(";")[0], adminuser.getIdCard().split(";")[0], adminuser.getUsername()});
            HttpRequestTool.sendPost("http://47.105.220.31:4000/channels/mychannel/chaincodes/mycc", jsonObject.toString(), token);


            return R.ok("操作成功，用户" + user.getUsername() + "审核通过！");
        }
    }


    /**
     * 用户未通过审核
     *
     * @param id
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/reviewFail", method = RequestMethod.GET)
    private R reviewFail(int id, String remark, HttpServletRequest request) {
        HttpSession session = request.getSession();
        int adminid = Integer.parseInt(session.getAttribute("userID").toString());
        UserDo adminuser = userService.selectUserByID(adminid);
        UserDo user = userService.selectUserByID(id);
        if (null == user || user.getUserStatus() != 0) {
            return R.error("被审核者不存在或已被审核！");
        }
        out.println(adminuser.getUserType());
        out.println(user.getInstitutionType());
        out.println(adminuser.getInstitutionType());
        if (adminuser.getUserType() != 3 || !user.getInstitutionType().equals(adminuser.getInstitutionType()))
            return R.error("权限错误,您当前无此权限！");
        else {
            userService.updateState(id, -1, remark, "");
            return R.ok("操作成功，用户" + user.getUsername() + "未通过审核！");
        }

    }


    /**
     * 跳用户修改界面
     *
     * @return
     */
    @RequestMapping("/toUpdateUser")
    private String toUpdateUser(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();
        UserDo userDo = (UserDo) session.getAttribute("users");
        model.addAttribute("userdata", userDo);
        return "update-simple.html";
    }


    /**
     * 跳公众号界面
     *
     * @return
     */
    @RequestMapping("/toSearchDetails")
    private String toSearchDetails() {
        return "search-detail-public.html";
    }


    /**
     * 用户更新
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/updateUser")
    private R UpdateUser(@RequestBody UserDo userDo) {
        out.println(userDo.getPassword());
        UserDo acUser = userService.selectUserByID(userDo.getId());
        if (null == acUser)
            return R.error("用户不存在！");
        if (!userDo.getUsername().equals(acUser.getUsername()))
            return R.error("用户名不正确！");
        if (!Md5.getMD5(userDo.getPassword()).equals(acUser.getPassword()))
            return R.error("验证密码错误！");
        if (userDo.getUserType() == 3)
            return R.error("无法获得管理员权限！");
        userService.updateUser(userDo);
        return R.ok("用户信息更新成功，请等待审核！");
    }

    /**
     * 跳修改密码界面
     *
     * @return
     */
    @RequestMapping("/topassword")
    private String topassword() {
        return "update-password.html";
    }


    /**
     * 修改密码
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/updatePassword")
    private R updatePassword(String password, String newpassword, HttpServletRequest request) {
        HttpSession session = request.getSession();
        String s = session.getAttribute("userID").toString();
        UserDo acUser;
        if (s == null || s == "")
            return R.error("请先登录再修改密码！");
        int id = Integer.parseInt(s);
        acUser = userService.selectUserByID(id);
        out.println(password);
        if (!acUser.getPassword().equals(Md5.getMD5(password))) {
            return R.error("原密码输入错误！");
        }
        userService.updatePassword(id, Md5.getMD5(newpassword));
        return R.ok("密码更新成功！");
    }

    @ResponseBody
    @RequestMapping("/userRecoverPassword1")
    private R userRecoverPassword(@RequestBody String param) {
        System.out.println("111111111111111111");
        JSONObject jsonObject = JSONObject.fromObject(param);
        List<UserDo> userDoList = userService.selectUserByTnstitutionNumber(jsonObject.getString("institutionNumber"));
        if (userDoList.size() == 0) {
            return R.error(-1, "请填写正确的营业执照编号");
        }
        System.out.println(userDoList.size());
        for (int i = 0; i < userDoList.size(); i++) {
            System.out.println(userDoList.get(i).getIdCard().split(";")[0]);
            if (userDoList.get(i).getIdCard().split(";")[0].equals(jsonObject.getString("idCard"))) {
                //userDoList.get(i).setPassword(Md5.getMD5(jsonObject.getString("password1")));
                userService.updatePassword(userDoList.get(i).getId(), Md5.getMD5(jsonObject.getString("password1")));
                return R.ok("密码修改成功");
            }
        }
        return R.error(-2, "该用户不存在");


    }


    /**
     * 返回信息统计界面
     *
     * @return
     */
    @RequestMapping("/toInformationStatic")
    private String toInformationStatic() {
        return "informationStatis.html";
    }


    /**
     * 获取相同机构用户名
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getUnitUser")
    private R getUnitUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String s = session.getAttribute("userID").toString();
        UserDo acUser;
        if (s == null || s == "")
            return R.error("请先登录！");
        int id = Integer.parseInt(s);
        acUser = userService.selectUserByID(id);
        List<UserDo> nameList = userService.selectUserByTnstitutionNumber(acUser.getInstitutionNumber());
        List<String> list = new ArrayList();
        for (int i = 0; i < nameList.size(); i++) {
            out.println(nameList.get(i).getUsername());
            list.add(nameList.get(i).getUsername());
        }
        R r = new R();
        r.put("nameList", nameList);
        return r;
    }
}