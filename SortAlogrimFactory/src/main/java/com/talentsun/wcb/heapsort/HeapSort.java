package com.talentsun.wcb.heapsort;

import com.talentsun.wcb.sort.sort;
import com.talentsun.wcb.utils.SortUtils;

/**
 * Created by Administrator on 2017/4/25.
 * 算法思想：堆属性
 * 时间复杂度 -> O(logn)
 * 空间复杂度 ->
 */

//建立堆算法
public class HeapSort implements sort {
    private void heapAdjust(int[] arr,int root,int end){
        int temp = arr[root];
        for(int i=2*root+1;i<end;i*=2){
            if(i<end&&arr[i]<arr[i+1]){
                i++;
            }
            if(temp>=arr[i]){
                break;
            }
            arr[root] = arr[i];
            root = i;

        }
        arr[root] = temp;
    }

    /**
     *
     * @param arr
     */
    private void heapSort(int[] arr){
        int length = arr.length;
        for(int i = length/2;i>=0;i--){
            heapAdjust(arr,i,length -1);
        }

        for(int i = length-1;i>=0;i--){
            SortUtils.swap(arr,0,i);
            heapAdjust(arr,0,i-1);
        }

    }
    public void sort(int[] arr) {
        heapSort(arr);
    }
}
//