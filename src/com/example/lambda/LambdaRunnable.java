package com.example.lambda;

public class LambdaRunnable {

	public static void main(String[] args) {
		
		Thread th = new Thread(()->
			System.out.println("Lambda Runnable in Action!")
		);
		th.start();
	}

}
