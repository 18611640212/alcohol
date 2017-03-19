package com.alcoholManage.enums;

/**
 * Created by mac on 2017/3/12.
 */

public enum LoginType {

    NORMAL_USER_LOGIN(1,"普通用户登陆"),
    MERCHANT_USER_LOGIN(2,"商家用户登陆"),
    POT_COMPANION_LOGIN(3,"酒友用户登陆");



    private int code;
    private String name;

    private LoginType(int code, String name){
        this.setCode(code);
        this.setName(name);
    }


    public static LoginType getLoginTypeByCode(int code){

        LoginType[] types = LoginType.values();
        for(int i=0;i<types.length;i++){
            if(types[i].getCode()==code){
                return types[i];
            }
        }

        return null;

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
