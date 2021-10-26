package com.cep.main;
import java.util.Random;
public class Dice {

	public Dice() {
		
	}
	
	// returns the total of multiple rolls of the same die
	int oneTypeRollers(int howManySides, int howManyTimes ) {
		int[] rollArray = new int[howManyTimes];
		for (int i = 0; i<howManyTimes; i++) {
			rollArray[i] =( new Random().nextInt(howManySides)) +1;	
			//System.out.println(rollArray[i]);
		}
		int result = 0;
		for (int i=0; i<rollArray.length; i++) {
			result = result + rollArray[i];
		}
		return result;
	}
	
	//three sided die
	int threeSided() {
		int result = 1;
		result = new Random().nextInt(3);
		result = result +1;
		return result;
	}
	
	//any sided die
	int sided(int howManySides) {
		int myDie = howManySides;
		int result =1;
		result = new Random().nextInt(myDie);
		result = result + 1;
		return result;
	}
	
	//2 10 sided and 2, 3 sided
	int taskTwo() {
		
		int[] output = new int[4];
		output[0] = this.sided(10);
		output[1] = this.sided(10);
		output[2] = this.sided(3);
		output[3] = this.sided(3);
		
		
		int result = 0;
		for (int i=0; i<output.length; i++) {
			result = result + output[i];
		}
		return result;
	}
	// roll one of each die and sum the total score
	int taskThree() {
		int[] output = new int[5];
		output[0] = this.sided(3);
		output[1] = this.sided(4);
		output[2] = this.sided(6);
		output[3] = this.sided(8);
		output[4] = this.sided(10);
		
		int result = 0;
		for (int i=0; i<output.length; i++) {
			System.out.println(output[i]);
			result = result + output[i];
		}
		return result;
	}
	
	// roll 4 dice and discard the lowest score
	int stretch(int howManysides) {
		int x = howManysides;
		int[] output = new int[4];
		for (int i = 0; i<output.length; i++) {
			output[i] = this.sided(x);
			System.out.println(output[i]);
		}
		int lowest = output[0];
		for (int i = 0; i<output.length; i++) {
			if (output[i]< lowest) {
				lowest = output[i];
			}
		}
		
		int result =0;
		for(int i=0; i<output.length; i++) {
			System.out.println(output[i]);
			result = result + output[i];
		}
		result = result - lowest;
		return result;
	}
	
	//through a  6 sided die 4 times, get an extra throw every time a 6 is thrown
	int stretch2() {
		
		int result =0;
		return result;
	}
	
}
