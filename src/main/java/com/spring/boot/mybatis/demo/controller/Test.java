package com.spring.boot.mybatis.demo.controller;

import java.util.ArrayList;

/**
 * @auther xuxq
 * @date 2019/1/30 21:03
 */
public class Test {
    public static void main(String[] args) {
        ///冒泡函数代码实现
        int[] arr = {9,40,6,7,1,3,8};

        for (int i = 0; i < arr.length; i++) {
            if ( i <= arr.length-1) {
                sort(arr);
            }

        }

        for ( int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    private static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int temp;
            if (arr[i] >= arr[i+1] ){
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;

            } else {
                arr[i] = arr[i];
                arr[i+1] = arr[i+1];
            }
        }
    }

}
