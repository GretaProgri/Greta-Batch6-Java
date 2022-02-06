package com.noorteck.java.day16;

public class BrokenCode {

	public static void main(String[] args) {

		int addResult = addTwoNumbers(2, 4);
		

		System.out.println(addResult);

		for (int i = 0; i < 10; i++)
		System.out.println("Count"+i);
	}
	//	whoseFavNumber(2);
	//	whoseFavNumber(3);
	//	whoseFavNumber(1);
	//	myName = ("John Cena");  
//}
	public static void myName(String name) {
		System.out.println("My name is " + name);
	}
	
	
	// remove a curly bracket

	public static int addTwoNumbers(int numOne, int numTwo) { // took void out adding double as parameters

		int result= numOne+numTwo;

		System.out.println(numOne + " + " + numTwo + " = " + result);

		return result;
	}

	public static String whoseFavNumber(int i) {
		String result = ""; // change double to boolean

		if (i == 1) {
			result = "Brooke";
		} else if (i == 2 || i <= 4 && i >= 4) {
			result = "Dannia";
		} else if (i == 3) {
			result = "Helen";

		} else {

			result = "my favorite number";

		}
		return result;

	}
}
