package com.Java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStrDemo1 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(7);
        l.add(18);
        l.add(45);
        l.add(1);
        l.add(30);
        l.add(4);
        l.add(8);

        List<Integer> l2 = l.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(l2);
    }
}