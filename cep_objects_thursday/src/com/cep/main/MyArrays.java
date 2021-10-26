package com.cep.main;

public class MyArrays {
static String[ ] colours = {"red", "blue", "yellow"};

public MyArrays() {
	
}

void printColours() {
	for(int i=0; i<colours.length; i++) {
		System.out.println(colours[i]);
		
	}
	
}

void firstForEach() {
	int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
	for(int myInt:firstArray) {
		System.out.println(myInt);
	}
}
void squaredForEach() {
	int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
	for(int myInt:firstArray) {
		System.out.print((myInt*myInt) + " ");
	}
}

void arrayOutput() {
	int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i<firstArray.length; i++) {
		System.out.println(firstArray[i] + 2);
	}
}
void arraySecondOutput() {
	int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
	for(int i = 0; i<firstArray.length; i++) {
		System.out.print((firstArray[i]*firstArray[i]) + " ");
	}
}
int[] arraythirdOutput() {
	int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
	int[] secondArray = new int[10];
	for(int i = 0; i<firstArray.length; i++) {
		secondArray[9-i] = (firstArray[i]*firstArray[i]*firstArray[i]);
	}
	for(int i = 0; i<secondArray.length; i++) {
		System.out.println(secondArray[i]);
	}
	return secondArray;
}



}
