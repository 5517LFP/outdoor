package com.my.outdoor.utils;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebServlet;

@WebServlet
public class InitSystem implements ServletContextListener {

    Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);


    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("*******************************************************************************************");
        logger.info("***********************************");
        logger.info("*              OUTDOOR            *");
        logger.info("*             系统初始化          *");
        logger.info("***********************************");


    }


    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        logger.info("***********************************");
        logger.info("*              OUTDOOR            *");
        logger.info("*              系统关闭           *");
        logger.info("***********************************");
    }

}
