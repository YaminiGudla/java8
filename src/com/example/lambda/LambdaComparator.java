package com.example.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("lohitha","venkata Pavani","yamini","BV");
		names.sort(Comparator.comparingInt(str->str.length()));
		names.forEach(str->System.out.println(str));

	}

}
