package com.talentsun.wcb.shellsort;

import com.talentsun.wcb.bubblesort.BubbleSort;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Created by hasee on 2017/5/1.
 */
public class ShellSortTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private int[] arr={49,38,65,97,13,27,49};
    @Test
    public void sort() throws Exception {
        new ShellSort().sort(arr);
        logger.info("the shellsorted array is: {}",arr);

    }

}