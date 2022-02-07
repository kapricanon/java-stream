package com.mypackage;

import java.util.stream.Stream;

public class FindMax {
	
	
	public static void main(String[] args) {
		String[] input = new String[] {"a5", "a2", "a3"};
		
		System.out.println(
				Stream.of(input)
				.mapToInt(i -> Integer.parseInt(String.valueOf(i.charAt(1))))
				.max().getAsInt());
		
	}
	
	
}
