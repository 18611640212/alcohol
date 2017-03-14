package com.alcoholManage.domain.permission;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by mac on 2017/3/13.
 */
@Getter
@Setter
public class Menu {
    /**
     * 菜单名称(必填 唯一)
     */
    private String menuName;
    /**
     * 菜单跳转地址
     */
    private String menuPath;
    /**
     * 菜单普通状态下图片地址
     */
    private String upImage;
    /**
     * 菜单点击后图片地址
     */
    private String downImage;
    /**
     * 菜单权限开关（关闭时所有人可见）
     */
    private String permission;
    /**
     * 子菜单
     */
    private List<Menu> menus;


}
