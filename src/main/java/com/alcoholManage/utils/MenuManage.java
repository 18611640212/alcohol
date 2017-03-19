package com.alcoholManage.utils;

import com.alcoholManage.domain.permission.Menu;
import com.alcoholManage.domain.permission.Role;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mac on 2017/3/14.
 */
public class MenuManage {

    /**
     * 未设置权限的菜单
     */
    List<Menu> menus = new ArrayList<Menu>();
    /**
     * 设置权限的菜单
     */
    Map<String,Menu> permissionMenus = new HashMap<String, Menu>();

    /**
     * 权限
     */
    Map<String,Role> roleMap = new HashMap<String, Role>();

    private static MenuManage menuManage = new MenuManage();

    private MenuManage(){}

    public synchronized static MenuManage getInit(){
        if(menuManage == null){
            menuManage = new MenuManage();
        }
        return menuManage;
    }

    public void init(){
        initMenus();
        initRole();
    }


    /**
     * 根据角色id获取相应角色 以及角色的权限
     * @param id
     * @return
     */
    public Role getRoleById(String id){
        return roleMap.get(id);
    }



    private void initMenus() {
        String classPath = FileUtil.getClassPath();
        File file = new File(classPath+"");
        try {
            NodeList childNodes = FileUtil.getXmlNodeList(file);

            // 遍历这些子节点
            for (int i = 0; i < childNodes.getLength(); i++) {

                Menu menu = new Menu();

                // 获得每个对应位置i的结点
                Node node = childNodes.item(i);
                if ("item".equals(node.getNodeName())) {
                    String name = node.getAttributes().getNamedItem("name").getNodeValue();
                    if (StringUtils.isEmpty(name.trim())) {
                        continue;
                    }
                    menu.setMenuName(name);
                    String upImage = node.getAttributes().getNamedItem("upImage").getNodeValue();
                    menu.setUpImage(upImage);
                    String downImage = node.getAttributes().getNamedItem("downImage").getNodeValue();
                    menu.setDownImage(downImage);
                    String path = node.getAttributes().getNamedItem("path").getNodeValue();
                    menu.setMenuPath(path);
                    //区分权限菜单
                    String permission = node.getAttributes().getNamedItem("permission").getNodeValue();
                    menu.setPermission(permission);
                    if(StringUtils.isNotEmpty(permission))
                        permissionMenus.put(permission,menu);
                    else
                        menus.add(menu);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private void initRole(){
        String classPath = FileUtil.getClassPath();
        File file = new File(classPath+"");
        try {
            NodeList childNodes = FileUtil.getXmlNodeList(file);
            // 遍历这些子节点
            for (int i = 0; i < childNodes.getLength(); i++) {
                Role role = new Role();
                // 获得每个对应位置i的结点
                Node node = childNodes.item(i);

                if ("item".equals(node.getNodeName())) {
                    String name = node.getAttributes().getNamedItem("name").getNodeValue();
                    role.setRoleName(name);
                    String id = node.getAttributes().getNamedItem("id").getNodeValue();
                    role.setRoleId(id);
                    List<Menu> menuList = new ArrayList<Menu>();
                    Node menuListNode = node.getFirstChild();
                    NodeList nodes = menuListNode.getChildNodes();
                    for(int j = 0;j < nodes.getLength(); i++){
                         Node menuNode = nodes.item(i);
                        if("item".equals(menuNode.getNodeName())){
                            Menu menu = permissionMenus.get(menuNode.getAttributes().getNamedItem("ref"));
                            menuList.add(menu);
                        }
                    }
                    roleMap.put(role.getRoleId(),role);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
