package com.example.dockerfile;

public class HelloWorldPing {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < Util.TIMES_TO_REPEAT; i++) {
			System.out.println("Hello World Ping " + i);
			Thread.sleep(1000);
		}
	}
}