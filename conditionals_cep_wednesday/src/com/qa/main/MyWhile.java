package com.qa.main;
import java.util.Random;
public class MyWhile {

	String task1() {
		int total = 300;
		int spend = 25;
		while (total >= 87) {
			total = total - spend;
		}
		System.out.println(total);
		return "you're spending too much";
	}
	
	String task2(int cash, int lower){
		int total = cash;
		
		while (total >= lower) {
			int spend = (int)(new Random().nextInt(50));
			total = total - spend;
			System.out.println(total);
		}
		System.out.println(total);
		return "you're spending too much";
	}
	
	String task3(int cash, int lower){
		int total = cash;
		
		do {
			int spend = (int)(new Random().nextInt(50));
			total = total - spend;
			System.out.println(total);
		}while (total >= lower);
		System.out.println(total);
		return "Your balance is " + total +  ". You're spending too much";
	}
}
