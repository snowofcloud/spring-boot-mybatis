package com.jvm.study.ch02.gengric;

public class ImplGenerator2 implements Generator<String> {
    //反省类第二种实现方式，先不指定泛型，具体使用在指定
    @Override
    public String next() {
        return "Tom";
    }

    public static void main(String[] args) {
        ImplGenerator2 implGenerator2 = new ImplGenerator2();
        System.out.println(implGenerator2.next());
    }


}
