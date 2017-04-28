package com.talentsun.wcb.quicksort;

import com.talentsun.wcb.sort.sort;

/**
 * Created by talentsun on 2017/4/28.
 * 思想：分治算法
 * 时间复杂度 O(nlogn)
 * 空间复杂度：
 */
public class QuickSort implements sort {

    private int patition(int[] arr,int left,int right){
        int priokey = arr[left];
        while(left<right){
            while(left <right && arr[right] >= priokey)
                right --;
            arr[left] =  arr[right];

            while(left<right && arr[left] <= priokey)
                left ++;
            arr[right] = arr[left];

        }
        arr[left] = priokey;
        return left;
    }
    private void QuickSort(int[] arr,int left,int right){
        if(left >= right)
            return;
        int partition = patition(arr,left,right);
        QuickSort(arr,left,partition -1);
        QuickSort(arr,partition + 1,right);
    }
    public void sort(int[] arr) {
        QuickSort(arr,0,arr.length -1);
    }
}
