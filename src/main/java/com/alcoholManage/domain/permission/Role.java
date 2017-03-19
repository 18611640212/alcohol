package com.alcoholManage.domain.permission;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by mac on 2017/3/13.
 */
@Getter
@Setter
public class Role {

    /**
     * 权限id
     */
    private String roleId;
    /**
     * 权限名称
     */
    private String roleName;
    /**
     * 权限下包含的所有菜单
     */
    private List<Menu> menus;




}
