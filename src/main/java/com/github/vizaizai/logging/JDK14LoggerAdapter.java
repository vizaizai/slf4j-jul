package com.github.vizaizai.logging;

import org.slf4j.Marker;
import org.slf4j.event.LoggingEvent;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;
import org.slf4j.spi.LocationAwareLogger;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * @author liaochongwei
 * @date 2020/12/24 17:05
 */
public final class JDK14LoggerAdapter extends MarkerIgnoringBase implements LocationAwareLogger {
    private static final long serialVersionUID = -8053026990503422791L;
    final transient Logger logger;
    static String SELF = JDK14LoggerAdapter.class.getName();
    static String SUPER = MarkerIgnoringBase.class.getName();

    JDK14LoggerAdapter(Logger logger) {
        this.logger = logger;
        this.name = logger.getName();
    }

    public boolean isTraceEnabled() {
        return this.logger.isLoggable(Level.FINEST);
    }

    public void trace(String msg) {
        if (this.logger.isLoggable(Level.FINEST)) {
            this.log(SELF, Level.FINEST, msg, (Throwable)null);
        }

    }

    public void trace(String format, Object arg) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            this.log(SELF, Level.FINEST, ft.getMessage(), ft.getThrowable());
        }

    }

    public void trace(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            this.log(SELF, Level.FINEST, ft.getMessage(), ft.getThrowable());
        }

    }

    public void trace(String format, Object... argArray) {
        if (this.logger.isLoggable(Level.FINEST)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            this.log(SELF, Level.FINEST, ft.getMessage(), ft.getThrowable());
        }

    }

    public void trace(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.FINEST)) {
            this.log(SELF, Level.FINEST, msg, t);
        }

    }

    public boolean isDebugEnabled() {
        return this.logger.isLoggable(Level.FINE);
    }

    public void debug(String msg) {
        if (this.logger.isLoggable(Level.FINE)) {
            this.log(SELF, Level.FINE, msg, (Throwable)null);
        }

    }

    public void debug(String format, Object arg) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            this.log(SELF, Level.FINE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void debug(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            this.log(SELF, Level.FINE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void debug(String format, Object... argArray) {
        if (this.logger.isLoggable(Level.FINE)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            this.log(SELF, Level.FINE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void debug(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.FINE)) {
            this.log(SELF, Level.FINE, msg, t);
        }

    }

    public boolean isInfoEnabled() {
        return this.logger.isLoggable(Level.INFO);
    }

    public void info(String msg) {
        if (this.logger.isLoggable(Level.INFO)) {
            this.log(SELF, Level.INFO, msg, (Throwable)null);
        }

    }

    public void info(String format, Object arg) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            this.log(SELF, Level.INFO, ft.getMessage(), ft.getThrowable());
        }

    }

    public void info(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            this.log(SELF, Level.INFO, ft.getMessage(), ft.getThrowable());
        }

    }

    public void info(String format, Object... argArray) {
        if (this.logger.isLoggable(Level.INFO)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            this.log(SELF, Level.INFO, ft.getMessage(), ft.getThrowable());
        }

    }

    public void info(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.INFO)) {
            this.log(SELF, Level.INFO, msg, t);
        }

    }

    public boolean isWarnEnabled() {
        return this.logger.isLoggable(Level.WARNING);
    }

    public void warn(String msg) {
        if (this.logger.isLoggable(Level.WARNING)) {
            this.log(SELF, Level.WARNING, msg, (Throwable)null);
        }

    }

    public void warn(String format, Object arg) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            this.log(SELF, Level.WARNING, ft.getMessage(), ft.getThrowable());
        }

    }

    public void warn(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            this.log(SELF, Level.WARNING, ft.getMessage(), ft.getThrowable());
        }

    }

    public void warn(String format, Object... argArray) {
        if (this.logger.isLoggable(Level.WARNING)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, argArray);
            this.log(SELF, Level.WARNING, ft.getMessage(), ft.getThrowable());
        }

    }

    public void warn(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.WARNING)) {
            this.log(SELF, Level.WARNING, msg, t);
        }

    }

    public boolean isErrorEnabled() {
        return this.logger.isLoggable(Level.SEVERE);
    }

    public void error(String msg) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            this.log(SELF, Level.SEVERE, msg, (Throwable)null);
        }

    }

    public void error(String format, Object arg) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            this.log(SELF, Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void error(String format, Object arg1, Object arg2) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            this.log(SELF, Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void error(String format, Object... arguments) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            this.log(SELF, Level.SEVERE, ft.getMessage(), ft.getThrowable());
        }

    }

    public void error(String msg, Throwable t) {
        if (this.logger.isLoggable(Level.SEVERE)) {
            this.log(SELF, Level.SEVERE, msg, t);
        }

    }

    private void log(String callerFQCN, Level level, String msg, Throwable t) {
        LogRecord record = new LogRecord(level, msg);
        record.setLoggerName(this.getName());
        record.setThrown(t);
        this.fillCallerData(callerFQCN, record);
        this.logger.log(record);
    }

    private final void fillCallerData(String callerFQCN, LogRecord record) {
        StackTraceElement[] steArray = (new Throwable()).getStackTrace();
        int selfIndex = -1;

        int found;
        for(found = 0; found < steArray.length; ++found) {
            String className = steArray[found].getClassName();
            if (className.equals(callerFQCN) || className.equals(SUPER)) {
                selfIndex = found;
                break;
            }
        }

        found = -1;

        for(int i = selfIndex + 1; i < steArray.length; ++i) {
            String className = steArray[i].getClassName();
            if (!className.equals(callerFQCN) && !className.equals(SUPER)) {
                found = i;
                break;
            }
        }

        if (found != -1) {
            StackTraceElement ste = steArray[found];
            record.setSourceClassName(ste.getClassName());
            record.setSourceMethodName(ste.getMethodName());
        }

    }

    public void log(Marker marker, String callerFQCN, int level, String message, Object[] argArray, Throwable t) {
        Level julLevel = this.slf4jLevelIntToJULLevel(level);
        if (this.logger.isLoggable(julLevel)) {
            this.log(callerFQCN, julLevel, message, t);
        }

    }

    private Level slf4jLevelIntToJULLevel(int slf4jLevelInt) {
        Level julLevel;
        switch(slf4jLevelInt) {
            case 0:
                julLevel = Level.FINEST;
                break;
            case 10:
                julLevel = Level.FINE;
                break;
            case 20:
                julLevel = Level.INFO;
                break;
            case 30:
                julLevel = Level.WARNING;
                break;
            case 40:
                julLevel = Level.SEVERE;
                break;
            default:
                throw new IllegalStateException("Level number " + slf4jLevelInt + " is not recognized.");
        }

        return julLevel;
    }

    public void log(LoggingEvent event) {
        Level julLevel = this.slf4jLevelIntToJULLevel(event.getLevel().toInt());
        if (this.logger.isLoggable(julLevel)) {
            LogRecord record = this.eventToRecord(event, julLevel);
            this.logger.log(record);
        }

    }

    private LogRecord eventToRecord(LoggingEvent event, Level julLevel) {
        String format = event.getMessage();
        Object[] arguments = event.getArgumentArray();
        FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
        if (ft.getThrowable() != null && event.getThrowable() != null) {
            throw new IllegalArgumentException("both last element in argument array and last argument are of type Throwable");
        } else {
            Throwable t = event.getThrowable();
            if (ft.getThrowable() != null) {
                t = ft.getThrowable();
                throw new IllegalStateException("fix above code");
            } else {
                LogRecord record = new LogRecord(julLevel, ft.getMessage());
                record.setLoggerName(event.getLoggerName());
                record.setMillis(event.getTimeStamp());
                record.setSourceClassName("NA/SubstituteLogger");
                record.setSourceMethodName("NA/SubstituteLogger");
                record.setThrown(t);
                return record;
            }
        }
    }
}
