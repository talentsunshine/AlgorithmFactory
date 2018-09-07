package com.talentsun.wcb.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by talentsun on 2017/5/26.
 */
public class Test {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @org.junit.Test
    public  void maitestn(){
        String s1 = "123";
        logger.debug("first hashcode:{}",s1.hashCode());
        s1 = "253";
        logger.debug("second hashcode:{}",s1.hashCode());
    }


}
