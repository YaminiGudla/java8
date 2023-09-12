package com.example.predefinedfunctionalexample;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String args[]){
		Function<String,Integer> function = (str)->str.length();
		System.out.println(function.apply("Yamini"));
		
		Function<String,String> function1 = (str)->str.toLowerCase();
		System.out.println(function1.apply("YAMINI"));
	}
}
