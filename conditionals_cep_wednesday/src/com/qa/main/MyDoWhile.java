package com.qa.main;

import java.util.Random;

public class MyDoWhile {
	String myFirstDoWhile(int cash, int lower){
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
