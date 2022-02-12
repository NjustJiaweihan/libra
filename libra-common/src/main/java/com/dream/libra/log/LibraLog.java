package com.dream.libra.log;

import com.dream.libra.exception.BizException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hanjiawei004@ke.com
 * @summary
 */
public class LibraLog {

    private final Logger logger;

    private LibraLog(Logger logger){
        this.logger = logger;
    }

    public static LibraLog getInstance(Logger logger){
        return new LibraLog(logger);
    }

    public LibraLog error(String msg){
        logger.error(msg);
        return this;
    }

    public LibraLog error(String msg, Object var2){
        logger.error(msg, var2);
        return this;
    }

    public LibraLog error(String msg, Object var2, Object var3){
        logger.error(msg, var2, var3);
        return this;
    }

    public LibraLog error(String msg, Object... var2){
        logger.error(msg, var2);
        return this;
    }

    public LibraLog error(String msg, Throwable var2){
        logger.error(msg, var2);
        return this;
    }

    public void thenThrow(BizException e){
        throw e;
    }
}
