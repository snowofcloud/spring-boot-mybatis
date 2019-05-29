package com.jvm.study.ch02.gengric;

import java.util.HashMap;
import java.util.Map;

public class Theory {
    //泛型是JDK1.5提出的，
    //泛型擦除为了兼容以前的版本(弱记忆)，泛型保留了一些预留信息(俗称擦不干净)，反编译文件中出现有Signature标志的信息
    //泛型擦除，但也不能滥用泛型
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("King","18");
                        //反编译以后会出现
        System.out.println((String) map.get("King"));
    }

}
