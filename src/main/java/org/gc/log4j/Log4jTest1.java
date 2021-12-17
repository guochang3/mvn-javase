package org.gc.log4j;

import org.apache.log4j.Logger;

/**
 * @Author: guochang3
 * @DateTime: 2021/5/28 15:07
 * @Description: TODO
 */
public class Log4jTest1 {

    /* logger */
    private static final Logger logger = Logger.getLogger(Log4jTest1.class);


    public static void main(String[] args){
        logger.info("test logger");
    }
}