package com.github.vizaizai.logging;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;

/**
 * @author liaochongwei
 * @date 2020/12/24 17:06
 */
public class JDK14LoggerFactory implements ILoggerFactory {
    ConcurrentMap<String, Logger> loggerMap = new ConcurrentHashMap<>();

    public JDK14LoggerFactory() {
        java.util.logging.Logger.getLogger("");
    }

    public org.slf4j.Logger getLogger(String name) {
        if (name.equalsIgnoreCase("ROOT")) {
            name = "";
        }

        Logger slf4jLogger = this.loggerMap.get(name);
        if (slf4jLogger != null) {
            return slf4jLogger;
        } else {
            java.util.logging.Logger julLogger = java.util.logging.Logger.getLogger(name);
            julLogger.setUseParentHandlers(false);
            Formatter formatter = new DefaultFormatter();
            Handler consoleHandler = new ConsoleOutHandler(System.out, formatter);
            consoleHandler.setLevel(Level.ALL);
            Handler[] handlers = julLogger.getHandlers();
            if (handlers != null && handlers.length > 0) {
                // 不存在ConsoleOutHandler才加入
                boolean exists = Arrays.stream(handlers).anyMatch(e -> e instanceof ConsoleOutHandler);
                if (!exists) {
                    julLogger.addHandler(consoleHandler);
                }
            }else {
                julLogger.addHandler(consoleHandler);
            }
            julLogger.setLevel(Level.ALL);

            Logger newInstance = new JDK14LoggerAdapter(julLogger);
            Logger oldInstance = this.loggerMap.putIfAbsent(name, newInstance);
            return (oldInstance == null ? newInstance : oldInstance);
        }
    }
}