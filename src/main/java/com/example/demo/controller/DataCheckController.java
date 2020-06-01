package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.service.UploadService;
import com.example.demo.service.UserService;
import com.google.gson.Gson;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Controller
public class DataCheckController {
    @Autowired
    UploadService uploadService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getUpData", produces = "text/json;charset=utf-8")//获取证书数据申请列表
    @ResponseBody
    public String getGrade(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("收到证书数据列表请求");
        String id = "1";//机构类型

        HttpSession session = request.getSession();
        String ss = session.getAttribute("userID").toString();
        int userID = Integer.parseInt(ss);
        UserDo userDo = userService.selectUserByID(userID);
        String s = userDo.getInstitutionNumber();
        List<UserDo> list = userService.selectUserByTnstitutionNumber(s);
        HashSet hs = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getIdCard());
        }

        List<TransactionDo> tList = new ArrayList<>();
        List<TransactionDo> transactionDoList = uploadService.selectDataByTrancId(id, "4");
        for (int i = 0; i < transactionDoList.size(); i++) {
            if (hs.contains(transactionDoList.get(i).getUploadmanid() + ";" + transactionDoList.get(i).getUploadman()))
                tList.add(transactionDoList.get(i));

        }

        JSONArray jsonarray = JSONArray.fromObject(tList);
        System.out.println(jsonarray.toString());
        return jsonarray.toString();

    }

    @RequestMapping(value = "/getCheckList", produces = "text/json;charset=utf-8")//获取证书数据申请列表
    @ResponseBody
    public String getCheckList(String type) {
        String id = null;//机构类型
        Gson gson = new Gson();
        //上传数据种类6种 1 现场审核数据 2 证书申请数据 3 文件上传数据 4 证书上传数据 5 检测数据 6 试运行数据
        switch (type) {
            case "5":
                id = "5";
                break;
            case "6":
                id = "6";
                break;
            default:
                return gson.toJson(R.error("数据类型不合法"));
        }
        List<TransactionDo> datas = uploadService.selectDataByType(id);
        return gson.toJson(R.ok().put("data", datas));
    }

    @RequestMapping(value = "/getDataDetails", produces = "text/json;charset=utf-8")//获取数据列表
    @ResponseBody
    public String getDataDetails(@RequestParam("id") int id) {
        Gson gson = new Gson();
        TransactionDo transactionDo = uploadService.selectById(id);
        return gson.toJson(transactionDo);

    }

    @RequestMapping(value = "/getUpFileData", produces = "text/json;charset=utf-8")//获取证书数据申请列表
    @ResponseBody
    public String getFileData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("收到文件数据列表请求");
        String id = "1";//机构类型
        HttpSession session = request.getSession();
        String ss = session.getAttribute("userID").toString();
        int userID = Integer.parseInt(ss);
        UserDo userDo = userService.selectUserByID(userID);
        String s = userDo.getInstitutionNumber();
        List<UserDo> list = userService.selectUserByTnstitutionNumber(s);
        HashSet hs = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getIdCard());
        }

        List<TransactionDo> tList = new ArrayList<>();
        List<TransactionDo> transactionDoList = uploadService.selectDataByTrancId(id, "3");
        for (int i = 0; i < transactionDoList.size(); i++) {
            if (hs.contains(transactionDoList.get(i).getUploadmanid() + ";" + transactionDoList.get(i).getUploadman()))
                tList.add(transactionDoList.get(i));

        }

        JSONArray jsonarray = JSONArray.fromObject(tList);
        System.out.println(jsonarray.toString());
        return jsonarray.toString();

    }

    @RequestMapping(value = "/getOnSiteData", produces = "text/json;charset=utf-8")//获取现场数据申请列表
    @ResponseBody
    public String getOnSiteData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("收到现场数据列表请求");
        String id = "1";//机构类型
        HttpSession session = request.getSession();
        String ss = session.getAttribute("userID").toString();
        int userID = Integer.parseInt(ss);
        UserDo userDo = userService.selectUserByID(userID);
        String s = userDo.getInstitutionNumber();
        List<UserDo> list = userService.selectUserByTnstitutionNumber(s);
        HashSet hs = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getIdCard());
        }

        List<TransactionDo> tList = new ArrayList<>();
        List<TransactionDo> transactionDoList = uploadService.selectDataByTrancId(id, "1");
        for (int i = 0; i < transactionDoList.size(); i++) {
            if (hs.contains(transactionDoList.get(i).getUploadmanid() + ";" + transactionDoList.get(i).getUploadman()))
                tList.add(transactionDoList.get(i));

        }
        JSONArray jsonarray = JSONArray.fromObject(tList);
        System.out.println(jsonarray.toString());
        return jsonarray.toString();

    }

    @RequestMapping(value = "/getApplyData", produces = "text/json;charset=utf-8")//获取现场数据申请列表
    @ResponseBody
    public String getApplyData(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("收到证书申请列表请求");
        String id = "1";//机构类型

        HttpSession session = request.getSession();
        String ss = session.getAttribute("userID").toString();
        int userID = Integer.parseInt(ss);
        UserDo userDo = userService.selectUserByID(userID);
        String s = userDo.getInstitutionNumber();
        List<UserDo> list = userService.selectUserByTnstitutionNumber(s);
        HashSet hs = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            hs.add(list.get(i).getIdCard());
        }

        List<TransactionDo> tList = new ArrayList<>();
        List<TransactionDo> transactionDoList = uploadService.selectDataByTrancId(id, "2");
        for (int i = 0; i < transactionDoList.size(); i++) {
            if (hs.contains(transactionDoList.get(i).getUploadmanid() + ";" + transactionDoList.get(i).getUploadman()))
                tList.add(transactionDoList.get(i));

        }


        JSONArray jsonarray = JSONArray.fromObject(tList);

        return jsonarray.toString();

    }

    @RequestMapping(value = "/checkCertificate", method = RequestMethod.POST, produces = "text/json;charset=utf-8")
//审核数据上传
    @ResponseBody
    public String checkAllData(@RequestBody String param) throws IOException {
        System.out.println("审核数据 " + param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String id = jsonObject.getString("id").replace("[", "").replace("]", "").replace("\"", "");
        String check = jsonObject.getString("check");
        String checkPersonID = jsonObject.getString("checkPersonID").trim();
        System.out.println(checkPersonID.length());
        String checkPersonName = jsonObject.getString("checkPersonName");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setCheckman(checkPersonName);
        transactionDo.setCheckmanid(checkPersonID);
        transactionDo.setId(Integer.parseInt(id));
        if (check.equals("true")) {
            String trancId = jsonObject.getString("transaction");
            transactionDo.setTrancid(trancId);
        }
        transactionDo.setIschecked(check);
        uploadService.updateById(transactionDo);
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));
    }

    @RequestMapping("/getDataList")//审核页面
    public ModelAndView intogetUploadPage() {

        return new ModelAndView("checkUploadCertificateDataList.html");
    }

    @RequestMapping(value = "/getDatadetail", method = RequestMethod.POST)//证书数据审核详情页面
    @ResponseBody
    public String intoDataDetail(@RequestParam("id") int id) {

        TransactionDo transactionDo = uploadService.selectById(id);
        String[] str = transactionDo.getBasedata().split("\\{");
        for (String temp1 : str) {
            System.out.println("temp1:" + temp1);
        }
        String[] str1 = str[1].split("\\}");
        String[] strid = str[0].replace("[", "").split(",");
        String result = "{" + str1[0] + "}";
        System.out.println("result:" + result);
        Gson gson = new Gson();
        Certificate certificate = gson.fromJson(result, Certificate.class);
        certificate.setCertificateID(strid[0].replace("\"", "").replace("\"", ""));
        certificate.setUnitId(strid[1].replace("\"", "").replace("\"", ""));
        System.out.println("transactionDo.getTemp():" + transactionDo.getTemp());
        String[] img = transactionDo.getTemp().split(" ")[0].split("//");
        certificate.setImg(img[img.length - 1]);
        System.out.println(certificate.toString());
        return certificate.toString();
    }

    @RequestMapping(value = "/getFileDatadetail", method = RequestMethod.POST)//文件数据审核详情页面
    @ResponseBody
    public String getFileDataDetail(@RequestParam("id") int id) {
        TransactionDo transactionDo = uploadService.selectById(id);
        String[] str = transactionDo.getBasedata().split("\\{");
        String[] str1 = str[1].split("\\}");
        String[] strid = str[0].replace("[", "").split(",");
        String result = "{" + str1[0] + "}";
        System.out.println(result);
        Gson gson = new Gson();
        FileData fileData = gson.fromJson(result, FileData.class);
        return fileData.toString();
    }

    @RequestMapping(value = "/getApplyDatadetail", method = RequestMethod.POST)//申请数据审核详情页面
    @ResponseBody
    public String getApplyDataDetail(@RequestParam("id") int id) {
        TransactionDo transactionDo = uploadService.selectById(id);
        String[] str = transactionDo.getBasedata().split("\\{");
        String[] str1 = str[1].split("\\}");
        String[] strid = str[0].replace("[", "").split(",");
        String result = "{" + str1[0] + "}";
        Gson gson = new Gson();
        String[] temp = transactionDo.getBasedata().split(",");
        String hashSummary = temp[temp.length - 2].replace("\"", "");
        String legalFileHash = temp[temp.length - 3].replace("\"", "");
        String applyHash = temp[temp.length - 4].replace("\"", "");
        String[] image1 = transactionDo.getTemp().split(" ")[0].split("//");
        String[] image2 = transactionDo.getTemp().split(" ")[1].split("//");

        ApplyData applyData = gson.fromJson(result, ApplyData.class);
        applyData.setImage1(image1[image1.length - 1]);
        applyData.setImgge2(image2[image2.length - 1]);
        applyData.setApplicationHash(applyHash);
        applyData.setHashSummary(hashSummary);
        applyData.setLegalFileHash(legalFileHash);


        return applyData.toString();
    }

    @RequestMapping(value = "/getOnsiteDatadetail", method = RequestMethod.POST)//现场资料数据审核详情页面
    @ResponseBody
    public String getOnsiteDataDetail(@RequestParam("id") int id) {
        TransactionDo transactionDo = uploadService.selectById(id);
        String[] str = transactionDo.getBasedata().split("\\{");
        String[] str1 = str[1].split("\\}");
        String[] strid = str[0].replace("[", "").split(",");
        String result = "{" + str1[0] + "}";
        System.out.println(result);
        Gson gson = new Gson();
        OnSiteData onSiteData = gson.fromJson(result, OnSiteData.class);
        onSiteData.setUnitId(transactionDo.getTemp1());
        return onSiteData.toString();
    }

    @RequestMapping(value = "/getImage")//现场资料数据审核详情页面
    @ResponseBody
    public OutputStream getOnsiteDataDetail(@RequestParam("imageUrl") String imageUrl, HttpServletResponse response) {
        response.setContentType("application/octet-stream");
        OutputStream os = null;
        try {
            System.out.println(imageUrl);
            InputStream is = new FileInputStream(imageUrl);
            os = response.getOutputStream();
            // 图片文件流缓存池
            byte[] buffer = new byte[1024];
            int count;
            while ((count = is.read(buffer)) > 0) {
                os.write(buffer, 0, count);
            }
            os.flush();
            os.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return os;
    }
}