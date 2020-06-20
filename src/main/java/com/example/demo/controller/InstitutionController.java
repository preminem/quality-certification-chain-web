package com.example.demo.controller;

import com.example.demo.domain.InstitutionDo;
import com.example.demo.domain.R;
import com.example.demo.domain.TransactionDo;
import com.example.demo.domain.UserDo;
import com.example.demo.service.InstitutionService;
import com.example.demo.service.UserService;
import com.example.demo.util.Md5;
import com.google.gson.Gson;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static java.lang.System.out;

@Controller
public class InstitutionController {
    @Autowired
    UserService userService;
    @Autowired
    private InstitutionService institutionService;

    // 查询机构
    @RequestMapping(value = "/getInstitutions", produces = "text/json;charset=utf-8")//获取证书数据申请列表
    @ResponseBody
    public List<InstitutionDo> getInstitution(HttpServletRequest request) throws IOException {
        Gson gson = new Gson();
        HttpSession session = request.getSession();
        String ss = session.getAttribute("userID").toString();
        int userID = Integer.parseInt(ss);

        UserDo userDo = userService.selectUserByID(userID);
        String un = userDo.getUsername();

        List<InstitutionDo> list = null;
        switch (un) {
            case "admin1":
                list = institutionService.selectInstitutionByType("1");
                break;
            case "admin2":
                list = institutionService.selectInstitutionByType("2");
                break;
            case "admin3":
                list = institutionService.selectInstitutionByType("3");
                break;
            default:
                return null;
        }
        return list;

    }

    // 更新机构状态
    @RequestMapping(value = "/updateInstitutionStatus", method = RequestMethod.POST, produces = "text/json;charset=utf-8")
    @ResponseBody
    public String updateInstitutionStatus(String institution_number, String isInvalid) throws IOException {
        System.out.println("updateInstitutionStatus: " + institution_number + " " + isInvalid);
        institutionService.updateState(institution_number, isInvalid);
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));
    }
}

