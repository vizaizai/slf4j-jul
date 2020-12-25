package com.github.vizaizai.logging;

import java.io.OutputStream;
import java.util.logging.Formatter;
import java.util.logging.StreamHandler;

/**
 * @author liaochongwei
 * @date 2020/12/25 11:13
 */
public class ConsoleOutHandler extends StreamHandler {
    public ConsoleOutHandler(OutputStream out, Formatter formatter) {
        super(out, formatter);
    }
}
