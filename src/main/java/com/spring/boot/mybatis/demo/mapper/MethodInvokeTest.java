package com.spring.boot.mybatis.demo.mapper;

import java.lang.reflect.Method;

/**
 * @auther xuxq
 * @date 2019/2/19 11:28
 */
public class MethodInvokeTest {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.spring.boot.mybatis.demo.entity.Student");
        Method toString = aClass.getMethod("toString");
        System.out.println(toString.invoke("sdg"));
    }
}
