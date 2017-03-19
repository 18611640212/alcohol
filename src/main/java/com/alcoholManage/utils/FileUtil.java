package com.alcoholManage.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by mac on 2017/3/14.
 */
public class FileUtil {

    public static String getClassPath(){
        return ClassLoader.getSystemResource("").getPath();
    }


    public static NodeList getXmlNodeList(File file)throws Exception{
        Element element = null;
        // documentBuilder为抽象不能直接实例化(将XML文件转换为DOM文件)
        DocumentBuilder db = null;
        DocumentBuilderFactory dbf = null;
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

        return childNodes;

    }

    public static void main(String[] args) {
        String classPath=FileUtil.getClassPath();
        String fileName=classPath+"menu.xml";
        System.out.println(FileUtil.getClassPath());
//            File file = new File("/menu.xml");
        File file = new File(fileName);

        try {
            FileUtil.getXmlNodeList(file);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
