package com.alcoholManage.domain;

import com.alcoholManage.enums.UserType;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by hpf on 2017/1/24.
 */
@Getter
@Setter
public class User {
    /**
     * 用户头id(微信uuid)
     */
    private String uuid;
    /**
     * 用户头像地址
     */
    private String hadeImagePath;
    /**
     * 用户账号
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户类型
     */
    private UserType userType;
    /**
     * 别名，用户的显示名称
     */
    private String alias;
    /**
     * 用户是否有效（是否关注）
     */
    private boolean isValid;
    /**
     * 角色id
     */
    private String roleId;

}
