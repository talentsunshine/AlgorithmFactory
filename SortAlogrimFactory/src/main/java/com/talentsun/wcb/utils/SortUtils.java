package com.talentsun.wcb.utils;

/**
 * Created by talentsun on 2017/4/25.
 */
public class SortUtils {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;



    }

    public static boolean varify(int[] arr){
        if(arr.length == 0 || arr == null){
            return false;
        }
        return true;
    }
}
