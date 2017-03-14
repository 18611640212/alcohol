package com.alcoholManage.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by mac on 2017/3/12.
 */

@Getter
@Setter
public enum  UserType {

    NORMAL_USER(1,"普通用户"),
    MERCHANT_USER(2,"商家用户"),
    POT_COMPANION(3,"酒友用户");



    private int code;
    private String name;

    private UserType(int code,String name){
        this.code=code;
        this.name=name;
    }





}
