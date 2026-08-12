package com.streamAPI;

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class Frequency {
	public static void main(String[] args) {

		String str = "Java Programming";

		Map<Character, Long> frequency = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(frequency);

	}
}
