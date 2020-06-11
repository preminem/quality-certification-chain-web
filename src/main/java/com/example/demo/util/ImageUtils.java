package com.example.demo.util;

import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ImageUtils {

    public static void getImage(String s, String path) throws IOException {

        String imgstr = s.split(",")[1];
        BASE64Decoder decoder1 = new BASE64Decoder();
        byte[] b = decoder1.decodeBuffer(imgstr);
        OutputStream out = new FileOutputStream(path);
        out.write(b);
        out.flush();
        out.close();

    }
}
