package com.talentsun.wcb.heapsort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hasee on 2017/4/27.
 */
public class HeapSortTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int[] arr={49,38,65,97,13,27,49};
    @Test
    public void sort() throws Exception {
         new HeapSort().sort(arr);
         logger.info("the heapsorted array is: {}",arr);
    }

}