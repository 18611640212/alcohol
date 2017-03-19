package com.alcoholManage;

import com.alcoholManage.utils.MenuManage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by mac on 2017/3/18.
 */
public class StartInit implements ServletContextListener {
    static final Logger logger = LoggerFactory.getLogger(StartInit.class);


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("系统初始化开始...");

        MenuManage.getInit().init();


        logger.info("系统初始化结束...");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
