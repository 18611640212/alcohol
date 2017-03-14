package com.alcoholManage.utils;

import com.alcoholManage.domain.permission.Menu;
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

    public void getXmlFile(File file) {


        Element element = null;
        // documentBuilder为抽象不能直接实例化(将XML文件转换为DOM文件)
        DocumentBuilder db = null;
        DocumentBuilderFactory dbf = null;
        try {
            // 返回documentBuilderFactory对象
            dbf = DocumentBuilderFactory.newInstance();
            // 返回db对象用documentBuilderFatory对象获得返回documentBuildr对象
            db = dbf.newDocumentBuilder();
            // 得到一个DOM并返回给document对象
            Document dt = db.parse(file);
            // 得到一个elment根元素
            element = dt.getDocumentElement();
            // 获得根节点
            System.out.println("根元素：" + element.getNodeName());
            // 获得根元素下的子节点
            NodeList childNodes = element.getChildNodes();

            // 遍历这些子节点
            for (int i = 0; i < childNodes.getLength(); i++) {

                Menu menu = new Menu();

                // 获得每个对应位置i的结点
                Node node = childNodes.item(i);
                if ("Menus".equals(node.getNodeName())) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
