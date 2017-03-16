package com.alcoholManage.utils;

/**
 * Created by mac on 2017/3/14.
 */
public class FileUtil {

    public static String getClassPath(){
        return Thread.currentThread().getContextClassLoader().getResource("").toString();
    }

    public static void main(String[] args) {
        System.out.println(FileUtil.getClassPath());
    }
}
