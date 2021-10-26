package com.cep.main;

import java.util.ArrayList;

public class MyArrayList {
ArrayList<String> pizzaList = new ArrayList<>();
void makeMyList() {
	System.out.println(pizzaList);
	pizzaList.add("mushroom");
	pizzaList.add("ham");
	System.out.println(pizzaList);
}
}
