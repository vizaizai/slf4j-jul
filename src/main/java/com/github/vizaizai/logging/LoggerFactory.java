package com.github.vizaizai.logging;

import org.slf4j.Logger;

/**
 * @author liaochongwei
 * @date 2020/12/24 16:49
 */
public class LoggerFactory {
    private LoggerFactory() {
    }

    public static Logger getLogger(Class<?> clazz) {
        Logger logger;
        try {
            Class.forName("org.slf4j.impl.StaticLoggerBinder");
            logger =  org.slf4j.LoggerFactory.getLogger(clazz.getName());
        }catch (ClassNotFoundException e) {
              logger = new JDK14LoggerFactory().getLogger(clazz.getName());
        }
        return logger;
    }
}
