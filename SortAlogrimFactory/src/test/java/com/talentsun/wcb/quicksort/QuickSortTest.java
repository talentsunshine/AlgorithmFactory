package com.talentsun.wcb.quicksort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by talentsun on 2017/4/28.
 */
public class QuickSortTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int[] arr={49,38,65,97,13,27,49};
    @Test
    public void sort() throws Exception {
        new QuickSort().sort(arr);
        logger.info("the quicksorted array is: {}",arr);

    }

}