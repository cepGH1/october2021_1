package com.qa.main;

public class Conditionals {
void numChecker(int myNum) {
	int num = myNum;
	if (num==10) {
		System.out.println("the number is 10");
	}else {
		System.out.println("the number is not 10");
	}
	
}

//Create a method which accepts 3 parameters, 2 integers and a boolean.

//If the boolean is true, the method will return a sum of the two numbers,
//and it if is false it will return the multiplication of the two numbers.
int myBoolChecker(int myFirstInt, int mySecondInt, boolean myBoolean) {
	int num1 = myFirstInt;
	int num2 = mySecondInt;
	boolean bool = myBoolean;
	int result = 0;
	if(bool) {
		result = num1 + num2;
		
	}else {
		result = num1*num2;
	}
	
	return result;
}

void flowChart1(int myNum) {
	if(myNum>200) {
		System.out.println("A");
		if(myNum > 600) {
			System.out.println("C");
			
		}else {
			System.out.println("B");
			if(myNum>400) {
				System.out.println("D");}else {
					System.out.println("E");
				}
			}
		
	
		
	}else {
		System.out.println("1");
		if(myNum>100) {
			System.out.println("3");
			if(myNum >600) {
				System.out.println("4");
			}else {
				if(myNum>500) {
					System.out.println("6");
				}else {System.out.println("7");}
			}
		}else {
			System.out.println("2");
		}
	}
}

int blackJack(int myfirstInt, int mySecondInt) {
	int num1 = myfirstInt;
	int num2 = mySecondInt;
	int num1comp = 21-num1;
	int num2comp = 21-num2;
	
	if(num1 >21 && num2>21) {
		return 0;
	}
	if(num1>21 && num2<=21) {
		return num2;
	}
	if(num2>21 && num1<=21) {
		return num1;
	}
	
	else if(num1comp>num2comp) {
		return num2;
	}
	else if(num2comp>num1comp) {
		return num1;}
	
	else {return num1;}
}

int summer(int x, int y, int z) {
	if (x==y && y==z) {
		return 0;
	}
	else if(x==y && y!=z) {
		return x+z;
	}
	else if(x==z && x!=y) {
		return x+y;
	}
	else if(y==z && x!=y) {
		return x+y;
	}
	else {
	return x+y+z;}
}


}
