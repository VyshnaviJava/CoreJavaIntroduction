package com.Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStrDemo3 {

    public static void main(String[] args) {

        List<Double> salaries = Arrays.asList(
                80000.00, 40000.00, 30000.00,
                70000.00, 60000.00);

        List<Double> upSalaries = salaries.stream()
                .map(d -> d + 5000)
                .filter(i -> i > 50000)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(upSalaries);

        List<String> names = Arrays.asList(
                "Manohar", "Amar", "Vinod",
                "Anil", "Varshith", "Srikanth");

        List<String> upNames = names.stream()
                .map(name -> name + "-JFS#1-Vcube")
                .collect(Collectors.toList());

        upNames.forEach(System.out::println);
    }
}