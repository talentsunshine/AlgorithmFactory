package com.talentsun.wcb.insertsort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by hasee on 2017/4/27.
 */
public class InsertSortTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int[] arr={49,38,65,97,13,27,49};
    @Test
    public void sort() throws Exception {
        new InsertSort().sort(arr);
        logger.info("the insertSort array is: {}",arr);
    }

}