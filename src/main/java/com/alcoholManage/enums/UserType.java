package com.alcoholManage.enums;

/**
 * Created by mac on 2017/3/12.
 */

public enum  UserType {

    NORMAL_USER(1,"普通用户"),
    MERCHANT_USER(2,"商家用户"),
    POT_COMPANION(3,"酒友用户");



    private int code;
    private String name;

    private UserType(int code,String name){
        this.setCode(code);
        this.setName(name);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
