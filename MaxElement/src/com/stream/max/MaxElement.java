package com.stream.max;

import java.util.Arrays;
import java.util.List;

public class MaxElement {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 20, 50, 70, 90);

		int max = number.stream().max(Integer::compareTo).get();
		System.out.println(max);

	}

}
