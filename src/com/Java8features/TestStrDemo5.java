package com.Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStrDemo5 {

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
                Arrays.asList("srikanth", "Java"),
                Arrays.asList("Vishwanath", "SQL"),
                Arrays.asList("Vcube", "JFS")
        );

        List<String> flatMap = list.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flatMap);
    }
}