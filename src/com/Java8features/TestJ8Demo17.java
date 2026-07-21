package com.Java8features;

import java.util.function.Supplier;

public class TestJ8Demo17 {

    public static void main(String[] args) {

        Supplier<Integer> s = () -> {

            int a = 100;
            int b = 200;

            return a * b;
        };

        System.out.println(s.get());
    }
}