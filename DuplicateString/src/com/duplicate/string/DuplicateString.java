package com.duplicate.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateString {

	public static void main(String[] args) {

		String str = "papaya";

		Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		freq.entrySet().stream().filter(e -> e.getValue() > 1)
				.forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
	}
}
