package com.talentsun.wcb.SelectSort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by hasee on 2017/4/27.
 */
public class SelectSortTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int[] arr={49,38,65,97,13,27,49};
    @Test
    public void sort() throws Exception {
        new SelectSort().sort(arr);
        logger.info("the selectsorted array is: {}",arr);


    }

}