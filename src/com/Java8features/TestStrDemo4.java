package com.Java8features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStrDemo4 {

    public static void main(String[] args) {

        System.out.println("main method started !");

        List<String> names = Arrays.asList(
                "JAVA", "JDBC", "JPA", "J2EE", "JPA", "J2EE", "Spring", "Spring Boot");

        List<String> filteredNames = names.stream()
                .filter(s -> s.toLowerCase().startsWith("j"))
                .sorted()
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);

        System.out.println("***************************************");

        List<String> updatedNames = names.stream()
                .map(s -> s.concat("- VCUBE"))
                .sorted()
                .distinct()
                .limit(3)
                .toList();

        updatedNames.forEach(System.out::println);

        System.out.println("***************************************");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("sum of all the numbers: " + sum);

        List<String> snames = Arrays.asList("srikanth", "vcube", "java");

        List<String> upperNames = snames.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);

        System.out.println("***************************************");

        long count = Stream.of("apple", "banana", "cherry")
                .filter(s -> s.contains("a"))
                .count();

        System.out.println(count);
    }
}