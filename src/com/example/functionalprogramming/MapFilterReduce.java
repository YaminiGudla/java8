package com.example.functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class MapFilterReduce {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("January","May","July","Sep","Feb");
		String result = names.stream()
		      .map(str->str.toUpperCase())
		      .filter(str->str.length()<4)
		      .reduce("",(prevStr, str)->prevStr+str);
		System.out.println(result);
	}

}
