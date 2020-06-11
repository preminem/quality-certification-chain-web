package com.example.demo.domain;

import java.util.HashMap;
import java.util.Map;

public class HttpRes{
    private Boolean success;
    private String message;
    public HttpRes (Boolean success,String message){
        this.success = success;
        this.message = message;
    }

    public HttpRes (){
        this.success = false;
        this.message = "None";
    }

    public  Boolean getsuccess(){
        return success;
    }
    public  String getMessage(){
        return message;
    }
//    private static final long serialVersionUID = 1L;
//
//    public HttpRes() {
//        put("success", 0);
//        put("message", "操作成功");
//    }
//
//    public static HttpRes error() {
//        return error(1, "操作失败");
//    }
//
//    public static HttpRes error(String msg) {
//        return error(500, msg);
//    }
//
//    public static HttpRes error(int code, String msg) {
//        HttpRes r = new HttpRes();
//        r.put("seccess", code);
//        r.put("message", msg);
//        return r;
//    }
//
//    public static HttpRes ok(String msg) {
//        HttpRes r = new HttpRes();
//        r.put("message", msg);
//        return r;
//    }
//
//    public static HttpRes ok(Map<String, Object> map) {
//        HttpRes httpRes = new HttpRes();
//        httpRes.putAll(map);
//        return httpRes;
//    }
//
//    public static HttpRes ok() {
//        return new HttpRes();
//    }
//
//    @Override
//    public HttpRes put(String key, Object value) {
//        super.put(key, value);
//        return this;
//    }
}
