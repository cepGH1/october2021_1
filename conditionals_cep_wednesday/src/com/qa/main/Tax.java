package com.qa.main;

public class Tax {

	//returns the int tax rate based on boundaries and  a float salary entered
	int method1(float salary) {
		if (salary < 15000) {
			return 0;
		}
		else if(salary >=15000 && salary<20000) {
			return 10;
		}
		else if(salary >=20000 && salary<30000) {
			return 15;
		}
		
		else if(salary >=30000 && salary< 45000) {
			return 20;
		}
		else {
			return 25;
		}
	}
	
	//takes a float salary, calculates the tax rate and returns the amount of tax payable
	float method3(float salary) {
		float taxRate = (float)this.method1(salary);
		System.out.println(taxRate);
		float tax =  salary*(taxRate/100);
		return tax;
	}
}
