package com.even.number;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(1,2,4,8,5,10);
	
	List<Integer> even = list.stream()
			                  .filter(n -> n%2==0)
			                  .collect(Collectors.toList());
	System.out.println(even);
	}

}
