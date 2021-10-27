package com.qa.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<>();
		myList.add("bob");
		myList.add("charlie");
		myList.add("clare");
		myList.stream().forEach(n -> System.out.println(n));
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
		//names.stream().forEach(n -> System.out.println("hello " + n));
		List<String> result = 
		names.stream().filter(str -> !str.startsWith("J")).collect(Collectors.toList());
		List<String> result2 =
		result.stream().map(str -> "hello " + str).collect(Collectors.toList());
		
				result2.add(2, "James");
		 
		result2.stream().forEach(n -> System.out.println(n));	 
		
		//output the result of multiplying the numbers in a list 1*2*3 etc	
		List<Integer> numbers = Arrays.asList(3,4,7,8,12); 
		int life = 
				numbers.stream().reduce((a,b) -> a*b).get();
		
		System.out.println(life);
		
		
		
		//find the biggest and smallest number in a List by using stream().sorted()
		List<Integer> numbers3 = Arrays.asList(6, 7, 32, 5);
		int myMin = numbers3.stream().min(Comparator.naturalOrder()).get();
		int myMax = numbers3.stream().min(Comparator.reverseOrder()).get();
		
		System.out.println("The lowest number is " + myMin);
		System.out.println("The highest number is " + myMax);
		
		//weed out all the odd numbers
		List<Integer> evens =
				numbers3.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		evens.stream().forEach(n->System.out.println(n));
		List<Integer> odds =
				numbers3.stream().filter(x -> !(x % 2 == 0)).collect(Collectors.toList());
		
		odds.stream().forEach(n->System.out.println(n));	
		//square every number in the list
		List<Integer> squares =
				numbers3.stream().map(n -> n*n).collect(Collectors.toList());
		int squareEvenInt =
				numbers3.stream().map(n->n*n).filter(y -> !(y%2==0)).min(Integer::compare).get();
		System.out.println("The square of the lowest odd number is " + squareEvenInt);
		
	}

}