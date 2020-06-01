package com.example.demo.controller;

import com.example.demo.domain.R;
import com.example.demo.domain.TransactionDo;
import com.example.demo.domain.TransactionDoExample;
import com.example.demo.service.UploadService;
import com.example.demo.util.ImageUtils;
import com.google.gson.Gson;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UploadDataController {//数据上传所有功能模块


    @Autowired
    UploadService uploadService;

    @RequestMapping("/uploadpage")//证书申请资料上传页面
    public ModelAndView intoUploadPage() {

        return new ModelAndView("upload_Certificate_Application.html");
    }

    @RequestMapping("/uploadFile")//文件审核资料上传页面
    public ModelAndView intoUploadFile() {


        return new ModelAndView("upload_Document_audit_Application.html");
    }

    @RequestMapping("/uploadCertification")//证书数据上传页面
    public ModelAndView intoUploadCertificationPage() {


        return new ModelAndView("upload_Certificate_data.html");
    }

    @RequestMapping("/uploadOnSiteData")//现场审核资料上传页面
    public ModelAndView intoUploadOnSitePage() {


        return new ModelAndView("upload_Site_audit.html");
    }

    @RequestMapping("/detectionPage")//检测检验上传页面
    public ModelAndView intoUploadDetection() {


        return new ModelAndView("upload_Detection.html");
    }

    @RequestMapping("/tryRunPage")//检测检验上传页面
    public ModelAndView intoTryRunPage() {


        return new ModelAndView("upload_test_run.html");
    }

    @RequestMapping(value = "/applyCertificateUpdate", method = RequestMethod.POST)//证书申请数据上传
    @ResponseBody
    public String applyCertificateUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String timeStr = df.format(new Date());
        String imgFilePath1 = System.getProperty("user.dir") + "/blockimg/" + "apply" + timeStr + ".jpg";
        String imgFilePath2 = System.getProperty("user.dir") + "/blockimg/" + "legal" + timeStr + ".jpg";
        System.out.println("收到证书申请数据");
        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String img1 = jsonObject.getString("image1");
        String img2 = jsonObject.getString("image2");
        ImageUtils.getImage(img1, imgFilePath1);
        ImageUtils.getImage(img2, imgFilePath2);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("operatorName");
        String uploadid = jsonObject.getString("operatorID");
        String unitID = jsonObject.getString("unitID");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setUploadmanid(uploadid);
        transactionDo.setTemp3("2");
        transactionDo.setTemp2(unitID);
        transactionDo.setTemp(imgFilePath1 + " " + imgFilePath2);
        transactionDo.setTemp1(unitID);
        transactionDo.setIschecked("0");
        transactionDo.setUnittype("1");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);
        //transactionDo.s
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));

    }

    @RequestMapping(value = "/testRunDataUpdate", method = RequestMethod.POST)//证书数据上传
    @ResponseBody
    public String testRunDataUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();

        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("postPersonName");
        String uploadId = jsonObject.getString("postPersonID");
        String unitID = jsonObject.getString("unitID");
        String cetificateId = jsonObject.getString("certificateID");

        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setTemp3("6");
        transactionDo.setUploadmanid(uploadId);
        transactionDo.setTemp1(unitID);
        transactionDo.setTemp2(cetificateId);
        transactionDo.setIschecked("0");
        transactionDo.setUnittype("1");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);

        //transactionDo.s
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));

    }

    @RequestMapping(value = "/detectionDataUpdate", method = RequestMethod.POST)//证书数据上传
    @ResponseBody
    public String detectionDataUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();
        System.out.println("收到证书数据");
        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("postPersonName");
        String uploadId = jsonObject.getString("postPersonID");
        String unitID = jsonObject.getString("unitID");
        String cetificateId = jsonObject.getString("certificateID");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setTemp3("5");
        transactionDo.setUploadmanid(uploadId);
        transactionDo.setTemp1(unitID);
        transactionDo.setUnittype("1");
        transactionDo.setTemp2(cetificateId);
        transactionDo.setIschecked("0");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));

    }

    @RequestMapping(value = "/certificateUpdate", method = RequestMethod.POST)//证书数据上传
    @ResponseBody
    public String certificateUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String timeStr = df.format(new Date());
        String imgFilePath1 = System.getProperty("user.dir") + "/blockimg/" + "certificate" + timeStr + ".jpg";

        System.out.println("收到证书数据");
        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String img1 = jsonObject.getString("image1");
        ImageUtils.getImage(img1, imgFilePath1);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("postPersonName");
        String uploadId = jsonObject.getString("postPersonID");
        String unitID = jsonObject.getString("unitID");
        String cetificateId = jsonObject.getString("certificateID");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setTemp3("4");
        transactionDo.setUploadmanid(uploadId);
        transactionDo.setTemp(imgFilePath1);
        transactionDo.setTemp1(unitID);
        transactionDo.setUnittype("1");
        transactionDo.setTemp2(cetificateId);
        transactionDo.setIschecked("0");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);
        //transactionDo.s
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));
    }

    @RequestMapping(value = "/fileUpdate", method = RequestMethod.POST) //文件上传
    @ResponseBody
    public String fileUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();
        System.out.println("收到文件审核数据");
        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("postPersonName");
        String uploadId = jsonObject.getString("postPersonID");
        String unitID = jsonObject.getString("unitID");
        String cetificateId = jsonObject.getString("certificateID");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setUploadmanid(uploadId);
        transactionDo.setTemp1(unitID);
        transactionDo.setTemp2(cetificateId);
        transactionDo.setUnittype("1");
        transactionDo.setTemp3("3");
        transactionDo.setIschecked("0");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);
        //transactionDo.s
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));

    }

    @RequestMapping(value = "/OnsiteUpdate", method = RequestMethod.POST) //文件上传
    @ResponseBody
    public String onSiteUpdate(@RequestBody String param) throws IOException {
        //HttpSession session=request.getSession();
        System.out.println("收到现场审核数据");
        System.out.println(param);
        JSONObject jsonObject = JSONObject.fromObject(param);
        String args = jsonObject.getString("args");
        String uploadman = jsonObject.getString("postPersonName");
        String uploadId = jsonObject.getString("postPersonID");
        String unitID = jsonObject.getString("unitID");
        String cetificateId = jsonObject.getString("certificateID");
        TransactionDo transactionDo = new TransactionDo();
        transactionDo.setBasedata(args);
        transactionDo.setUploadman(uploadman);
        transactionDo.setUploadmanid(uploadId);
        transactionDo.setTemp1(unitID);
        transactionDo.setTemp2(cetificateId);
        transactionDo.setTemp3("1");
        transactionDo.setUnittype("1");
        transactionDo.setIschecked("0");
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        df1.format(date);
        transactionDo.setTime(date);
        uploadService.insertTrancDate(transactionDo);
        //transactionDo.s
        Gson gson = new Gson();
        return gson.toJson(R.ok("成功"));

    }

    @RequestMapping(value = "/getTransaData", method = RequestMethod.GET) //获取交易数据
    @ResponseBody
    public List<TransactionDo> getTransaData() {
        Date date = new Date();
        DateFormat df1 = DateFormat.getDateInstance();
        System.out.println(df1.format(date));
        List<TransactionDo> list = uploadService.getByTime(date);
        List<TransactionDo> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            TransactionDo ts = (TransactionDo) list.get(i);
            System.out.println("ts：" + ts.getIschecked());
            if (ts.getIschecked().equals("0")) {
                ts.setIschecked("否");
            } else if (ts.getIschecked().equals("false")) {
                ts.setIschecked("审核失败");
            } else if (ts.getIschecked().equals("true")) {
                ts.setIschecked("是");
            }

            //数据类型
            //上传数据种类6种 1 现场审核数据 2 证书申请数据 3 文件上传数据 4 证书上传数据 5 检测数据 6 试运行数据

            if (ts.getTemp3().equals("1"))
                ts.setTemp3("现场审核数据");
            else if (ts.getTemp3().equals("2"))
                ts.setTemp3("证书申请数据");
            else if (ts.getTemp3().equals("3"))
                ts.setTemp3("文件上传数据");
            else if (ts.getTemp3().equals("4"))
                ts.setTemp3("证书上传数据");
            else if (ts.getTemp3().equals("5"))
                ts.setTemp3("检测数据");
            else if (ts.getTemp3().equals("6"))
                ts.setTemp3("试运行数据");
            list1.add(ts);
        }
        System.out.println(list1.size());
        return list1;

    }

    @RequestMapping(value = "/queryimg", method = RequestMethod.POST)
    @ResponseBody
    public String queryImg(@RequestBody String basedata) {
        System.out.println(basedata);
        JSONObject jsonObject = JSONObject.fromObject(basedata);
        String uploadid = jsonObject.getString("postPersonID");
        String uploadname = jsonObject.getString("postPersonName");
        String certificateId = jsonObject.getString("certificateID");
        TransactionDoExample example = new TransactionDoExample();
        example.createCriteria().andUploadmanEqualTo(uploadname).andUploadmanidEqualTo(uploadid).andTemp2EqualTo(certificateId);
        List<TransactionDo> list = uploadService.selectByExample(example);
        System.out.println(list.get(0).getTemp().split("//")[2]);
        return list.get(0).getTemp().split("//")[2];
    }
}





