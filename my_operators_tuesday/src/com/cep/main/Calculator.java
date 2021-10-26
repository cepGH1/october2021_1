package com.cep.main;

public class Calculator extends Main {
public static float myDivide() {
	float result = 10f/3f;
	return result;
}

public static float myDivide(float x, float y) {
	float result = x/y;
	return result;
}

public static float myAdd(float x, float y) {
	float result = x + y;
	return result;
}

public static float mySubtract(float x, float y) {
	float result = x - y;
	return result;
}

public static float myMultiply(float x, float y) {
	float result = x*y;
	return result;
}

public static float toThePowerOf(float x, int y) {
int power = y; 
float input = x;
float result = x;

for(int i=1; i<power; i++) {
	result = result*input;
}

return result;

}
	
}