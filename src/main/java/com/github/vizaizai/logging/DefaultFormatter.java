package com.github.vizaizai.logging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * @author liaochongwei
 * @date 2020/12/25 11:36
 */
public class DefaultFormatter extends Formatter {

    // time thread level loggerName msg throw
    private static final String FORMAT = "%1$s [%2$s] %3$s %4$s - %5$s %6$s %n";
    @Override
    public String format(LogRecord record) {
        String message = formatMessage(record);
        String throwable = "";
        if (record.getThrown() != null) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            pw.println();
            record.getThrown().printStackTrace(pw);
            pw.close();
            throwable = sw.toString();
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String time = dateFormat.format(new Date(record.getMillis()));
        return String.format(FORMAT, time, Thread.currentThread().getName(), this.getLevel(record.getLevel()),
                                     record.getLoggerName(), message, throwable);
    }


    private String getLevel(Level level) {
        switch(level.intValue()) {
            case 300:
                return org.slf4j.event.Level.TRACE.name();
            case 500:
                return org.slf4j.event.Level.DEBUG.name();
            case 800:
                return org.slf4j.event.Level.INFO.name();
            case 900:
                return org.slf4j.event.Level.WARN.name();
            case 1000:
                return org.slf4j.event.Level.ERROR.name();
            default:
                return "";
        }

    }
}
