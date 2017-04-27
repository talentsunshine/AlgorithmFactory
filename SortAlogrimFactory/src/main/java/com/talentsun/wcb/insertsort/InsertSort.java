package com.talentsun.wcb.insertsort;

import com.talentsun.wcb.sort.sort;

/**
 * Created by hasee on 2017/4/27.
 */
public class InsertSort implements sort {
    private void insertSort(int[] arr){
        int length = arr.length;
        for(int i = 1;i<length;i++){
            int j = i;
            int target = arr[j];
            while(j > 0 && target < arr[j - 1]){
                arr[j] = arr[j-1];
                j--;

            }
            arr[j] = target;
        }
    }
    public void sort(int[] arr) {
        insertSort(arr);
    }
}
