package com.jvm.study.ch04.clazzload;

public class SuperClazz {

    static {
        System.out.println("SuperClazz init...");
    }

    public static int value = 123;
    public static final String HELLOWPRLD = "hello world";
    public static final int WHAT = value;

}
