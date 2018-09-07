package com.talentsun.wcb.shellsort;

import com.talentsun.wcb.sort.sort;

/**
 * Created by hasee on 2017/4/29.
 * 算法思想：跳跃式
 * 时间复杂度：N(n^1.3)
 *
 */
public class ShellSort implements sort {
    private void shellSort(int[] arr,int d){
        int length = arr.length;
        for(int i = d;i<length;i++){
            int j = i - d;
            int temp = arr[i];
            while(j>=0&&arr[j] > temp){
                arr[j+d] = arr[j];
                j -=d;

            }
            if(j!=i-d){
                arr[j+d] = temp;
            }
        }
    }

    public void sort(int[] arr) {
        int length = arr.length;
        int d = length/2;
        while( d>=1){
            shellSort(arr,d);
            d /= 2;
        }

    }
}
