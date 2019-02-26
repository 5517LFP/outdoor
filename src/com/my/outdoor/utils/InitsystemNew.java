package com.my.outdoor.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configurable
public class InitsystemNew extends WebMvcConfigurerAdapter {

    Logger logger=LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("***********************************");
        logger.info("*              OUTDOOR            *");
        logger.info("*             系统初始化          *");
        logger.info("***********************************");
        super.addInterceptors(registry);
    }
}
