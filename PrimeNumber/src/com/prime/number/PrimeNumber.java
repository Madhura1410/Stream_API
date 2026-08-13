package com.prime.number;

import java.util.Arrays;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int arr[] = {2,4,5,7,9,100,20};
		
		Arrays.stream(arr)
		      .filter(n -> n>1)
		      .filter(n ->{
		    	  for(int i = 2; i<n; i++) {
		    		  if(n%i == 0) {
		    			  return false;
		    		  }
		    	  }
		    	  return true;
		      })
		.forEach(System.out::println);
	}

}
