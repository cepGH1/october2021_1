package com.qa.main;

public class MyException extends ArithmeticException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5590474084661920757L;

	
	

	public MyException() {
		super();
		System.out.println("custom exception");
		
	}

	public MyException(String s) {
		super(s);
		System.out.println("ended" + s);
	}
	

	
}
