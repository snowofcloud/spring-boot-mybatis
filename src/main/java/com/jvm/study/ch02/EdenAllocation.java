package com.jvm.study.ch02;

public class EdenAllocation {

    /*演示Eden From To内存分配情况*/
    private static final int _1MB =1024*1024; //1M的大小

    //对象优先在Eden分配
    public static void main(String[] args) {
        byte[] b1,b2,b3,b4;
        b1 = new byte[1*_1MB];
        b2 = new byte[1*_1MB];
        b3 = new byte[1*_1MB];
        b4 = new byte[1*_1MB];
    }

}
