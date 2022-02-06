package com.noorteck.java.day24;

public class Day24ExerciseFour {
	public static void main(String[] args) {

		Day24ExerciseFour obj= new Day24ExerciseFour();
		int n1[]= {6,1,2,3};
		int result[] = obj.getFirstLast(n1);
		System.out.println("[" + result[0] + "," + result[1]+ "]");
		
	}
	
	int[] getFirstLast(int[] number) {
		int[] result = new int[2];
		
	int firstElement=number[0];
	int lastElement=number[number.length-1];
	
	result[0]= firstElement;
	result[1]=lastElement;
	
				
		
				
				
		return result;
	}

}
/**

4. Write a method that takes an array of int parameter and return a new array of int
containing the first element and last element from the original array.

Access Modifier: default
Non-Access Modifier: non-static
Return Type: int []
Method Name: getFirstLast
Parameter1: int [] number
Test Data:
getFirstLast ([6, 1, 2, 3]) ----- [6,3]
getFirstLast ([13, 6, 1, 2, 3]) ----- [13,3]
getFirstLast ([0, 1, 4, 3 ,6]) ----- [0,6]
getFirstLast ([0, 6, 0]) ----- [0,0]



*/