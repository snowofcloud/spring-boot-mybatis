package com.jvm.study.ch02.gengric;

public class ImplGenerator<T> implements Generator<T> {

    //实现泛型类，方式1，一开始就指定泛型
    private T data;

    public ImplGenerator() {
    }

    public ImplGenerator(T data) {
        this.data = data;
    }

    @Override
    public T next() {
        return data;
    }

    public static void main(String[] args) {
        ImplGenerator<String> implGenerator = new ImplGenerator<String>("ming");
        System.out.println(implGenerator.next());
    }

}
