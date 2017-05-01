package com.talentsun.wcb.insertsort;

import com.talentsun.wcb.sort.sort;

/**
 * Created by hasee on 2017/4/27.
 * 从1 开始，
 * 算法思想：相邻比较，其余向前移动。最后查找合适位置插入
 * 时间复杂度：O(N^2)
 * 空间复杂度：
 *
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
