package com.qa.main;

import java.util.Scanner;

public class FridayExceptions {
	

	int doDivision() throws MyException{
		int[] mine = this.takeInTwoNumbers();
				
		try {
			return mine[0]/mine[1];
		}
		catch(MyException d) {
			d.printStackTrace();
			System.out.println("Please don't divide by zero");
			return 0;
		}
		catch (Exception e) {
			System.out.println("don't divide by zero please");
			return 0;
		}
		
	}
	
	int doDivision2()throws MyException{
		int[] myArray = this.takeInTwoNumbers();
		if(myArray[1] > 0 && myArray[0]<myArray[1]) {
			throw new MyException(" because answer is a fraction");
		}
		try {
		return myArray[0]/myArray[1];
		}
		catch(Exception e) {
			System.out.println("divided by zero");
			return 0;
		}
		
	}
	
	int baldDivision(int x, int y) {
		return x/y;
	}
	
	int[] takeInTwoNumbers() {
		Scanner myScanner = new Scanner(System.in);
		int[] i = new int[2];
		i[0] = myScanner.nextInt();
		i[1] = myScanner.nextInt();
		myScanner.close();
		return i;
		
			
		}
	}

