package com.talentsun.wcb.SelectSort;

import com.talentsun.wcb.sort.Sort;
import com.talentsun.wcb.utils.SortUtils;

/**
 * Created by talentsun on 2017/4/25.
 * 比较 n-1 次
 * 时间复杂度 -> O(N)
 * 空间复杂度 ->
 */
public class SelectSort implements Sort{
    private void selectSort(int[] arr){
        int length = arr.length;
        int minIndex = 0;
        for(int i = 0;i<length-1;i++){
            minIndex = i;
            for(int j = i+1;j<length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            if(minIndex != i){
                SortUtils.swap(arr,minIndex,i);
            }
        }

    }
    public void sort(int[] arr) {
        selectSort(arr);
    }
}