package com.cep.main;

import java.util.ArrayList;

/*- Add a new order to an orders array
- Move an existing order to a 'Done orders array'
- Return the name of an order
- Modify the order by index with a new name
- Remove the order from either arrays
- Print the length of either arrays
//- Clear either arrays
import java.util.ArrayList;*/

public class CafeQA {

	String one =  "Small Espresso";
	String two =  "Large Cold Brew";
	String three = "Medium Cappucinok";
	String four = "Medium Flat White";
	String five =  "Large Choc Cookie Frappe";
	String six = "Small Caramel Iced Latte";
	String seven = "Small Americano";
	String eight =  "Large Cafe Au Lait";
	String nine = "Medium Strawberry Iced Tea";
	ArrayList<String> workingOrderList;
	ArrayList<String> completedOrderList;
	ArrayList<Order> oWorkingOrderList;
	ArrayList<Order> oCompletedOrderList;
	
	public CafeQA() {
		workingOrderList = new ArrayList<>();
		completedOrderList = new ArrayList<>();
		oWorkingOrderList = new ArrayList<>();
		oCompletedOrderList = new ArrayList<>();
		
	}
	
	//add an order to the arraylist of orders
	String makeOrder(String order) {
		String message;
		workingOrderList.add(order);
		int place = workingOrderList.size() -1;
		message = "order : " + workingOrderList.get(place) + " is order " + workingOrderList.size();
		return message;
		
	}
	
	//print the length of the order list
	void printLength(ArrayList<String> myList) {
		System.out.println(myList.size());
	}
	
	//move an order from working to completed order list
	String completeOrder(int orderNum) {
		
		int orderIndex = orderNum -1;
		String finished = workingOrderList.remove(orderIndex);
		completedOrderList.add(finished);
		int completed = completedOrderList.size() -1;
		String comp = completedOrderList.get(completed);
		String result =  "This order of " + comp + " is complete" ;
		return result;
	}
	
	//retrieve an order from an order list
	String getOrder(int index) {
		String result = workingOrderList.get(index);
		return result;
	}
	
	// modify an order in working order list
	String modifyOrder(int orderNumber, String changedOrder) {
		int index = orderNumber -1;
		String result = workingOrderList.set(index, changedOrder);
		return result;
	}
	String addToOrder(int orderNumber, String addition) {
		int index = orderNumber -1;
		String originalOrder = workingOrderList.get(index);
		String newOrder = originalOrder + " + " + addition;
		workingOrderList.set(index, newOrder);
		String result = "Order Number " + orderNumber + " is now " + workingOrderList.get(index);
		return result;
	}
	
	void clearAllOrders() {
		
		completedOrderList.clear();
		workingOrderList.clear();
		System.out.println("All orders have been deleted");
		
	}
	
	void showWorkingOrders() {
		if(!workingOrderList.isEmpty()) {
		for(String order : workingOrderList) {
			System.out.println(order);
		}}else {
			System.out.println("There are no working orders");
		}
		}
	
	
	
	
	
	
	
	
}
