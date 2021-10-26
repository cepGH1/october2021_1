package com.cep.main;

public class Main {

	public static void main(String[] args) {
		//System.out.println(MyArrays.colours);
		//System.out.println(MyArrays.colours[1]);
		starter();
	}
	
	public static void starter() {
		CafeQA clare = new CafeQA();
		System.out.println(clare.makeOrder("black coffee"));
		System.out.println(clare.makeOrder("filter coffee"));
		clare.showWorkingOrders();
		System.out.println(clare.completeOrder(1));
		clare.showWorkingOrders();
		System.out.println(clare.makeOrder("hot chocolate"));
		clare.showWorkingOrders();
		System.out.println(clare.addToOrder(2, "whipped cream"));
		clare.showWorkingOrders();
		clare.clearAllOrders();
		clare.showWorkingOrders();
	}

}
