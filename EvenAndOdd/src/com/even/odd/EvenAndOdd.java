package com.even.odd;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOdd {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        Map<Boolean, List<Integer>> result =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even: " + result.get(true));
        System.out.println("Odd: " + result.get(false));
    }
}
