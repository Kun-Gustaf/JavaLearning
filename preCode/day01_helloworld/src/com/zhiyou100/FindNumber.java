package com.zhiyou100;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FindNumber {
    public  static boolean isNumInArray(int num, int[] array, int start ,int end){
        if(num<array[start]||num>array[end]||start>end)
        {
            return false;
        }
        int middle=(start+end)/2;
        if(array[middle] > num){
            return isNumInArray(num,array,start,middle-1);
        }
        else if(array[middle] < num){
            return isNumInArray(num,array,middle+1,end);
        }
        else {
            return true;
        }
    }

    public void bubbleSort(int[] arr, int n) {
        if (n <= 1) return;       //如果只有一个元素就不用排序了

        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面，
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {        //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;//没有数据交换，数组已经有序，退出排序
        }
    }
    public static void main(String[] args) {

        int [] arr={1,2,3,41,25,46,38,9,11,15,16,24,52,72};
        int num=6;

        if(isNumInArray(num,  arr, 0 ,arr.length-1)){
            System.out.println("num在数组中");
        }
        else {
            System.out.println("num不在数组中");
        }
    }
}
