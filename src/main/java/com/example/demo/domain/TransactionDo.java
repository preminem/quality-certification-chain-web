package com.example.demo.domain;

import java.util.Date;

public class TransactionDo {
    private Integer id;

    private String basedata;

    private String trancid;//交易id

    private String checkman;

    private String checkmanid;

    private String uploadman;

    private String uploadmanid;

    private String temp;//文件路径

    private String temp1;//机构代码

    private String temp2;//证书代码

    private String temp3;//上传数据种类6种 1 现场审核数据 2 证书申请数据 3 文件上传数据 4 证书上传数据 5 检测数据 6 试运行数据

    private String ischecked;//是否通过 默认0

    private String reason;

    private String unittype;//机构类型 1 认证机构 2 检测机构

    private Date time;//上传日期

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasedata() {
        return basedata;
    }

    public void setBasedata(String basedata) {
        this.basedata = basedata == null ? null : basedata.trim();
    }

    public String getTrancid() {
        return trancid;
    }

    public void setTrancid(String trancid) {
        this.trancid = trancid == null ? null : trancid.trim();
    }

    public String getCheckman() {
        return checkman;
    }

    public void setCheckman(String checkman) {
        this.checkman = checkman == null ? null : checkman.trim();
    }

    public String getCheckmanid() {
        return checkmanid;
    }

    public void setCheckmanid(String checkmanid) {
        this.checkmanid = checkmanid == null ? null : checkmanid.trim();
    }

    public String getUploadman() {
        return uploadman;
    }

    public void setUploadman(String uploadman) {
        this.uploadman = uploadman == null ? null : uploadman.trim();
    }

    public String getUploadmanid() {
        return uploadmanid;
    }

    public void setUploadmanid(String uploadmanid) {
        this.uploadmanid = uploadmanid == null ? null : uploadmanid.trim();
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1 == null ? null : temp1.trim();
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2 == null ? null : temp2.trim();
    }

    public String getTemp3() {
        return temp3;
    }

    public void setTemp3(String temp3) {
        this.temp3 = temp3 == null ? null : temp3.trim();
    }

    public String getIschecked() {
        return ischecked;
    }

    public void setIschecked(String ischecked) {
        this.ischecked = ischecked == null ? null : ischecked.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype == null ? null : unittype.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

}