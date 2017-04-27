package com.talentsun.wcb.bubblesort;

import com.talentsun.wcb.sort.Sort;
import com.talentsun.wcb.utils.SortUtils;

/**
 * Created by talentsun on 2017/4/25.
 * 比较 n-1次
 * 时间复杂度 -> O(N)
 * 空间复杂度 ->
 */
public class BubbleSort implements Sort{
    private void bubbleSort(int[] arr){
        int length = arr.length;
        for(int i = 0; i< length -1;i++){
            for(int j = length -1;j>i;j--){
                if(arr[j] < arr[j-1]){
                    SortUtils.swap(arr,j,j-1);
                }
            }
        }
    }

    private void BubbleSortNew(int[] arr){
        int length = arr.length;
        boolean flag = true;
        int k = length;
        while(flag){
            flag = false;
            for(int i = length - 1;i>k;i--){
                if(arr[i] < arr[i-1]){
                    SortUtils.swap(arr,i,i-1);
                    flag = true;
                }
            }
            k--;
        }

    }
    public void sort(int[] arr) {
        bubbleSort(arr);
    }
}