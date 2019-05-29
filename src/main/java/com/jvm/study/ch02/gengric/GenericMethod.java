package com.jvm.study.ch02.gengric;

public class GenericMethod {

    //泛型方法： <T>是返回类型
    public <T> T genericMethod(T t){
        return t;
    }

    //普通方法
    public void test(int x,int y){
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.genericMethod("cat"));
        System.out.println(genericMethod.genericMethod(180));
    }

}
