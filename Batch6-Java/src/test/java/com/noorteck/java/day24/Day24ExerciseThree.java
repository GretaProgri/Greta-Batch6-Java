package com.noorteck.java.day24;

public class Day24ExerciseThree {
	public static void main(String[] args) {
		
		int numberOne[]= {6,1,2,3};
		int numberTwo[]= {13,6,1,2,3};
		int numberThree[]= {0,1,4,3,6};
		int numberFour[]= {0,6,0};
		
		int resultOne= getTotal(numberOne);
		int resultTwo=getTotal(numberTwo);
		int resultThree=getTotal(numberThree);
		int resultFour=getTotal(numberFour);
			
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
	}


	public static int getTotal(int[] number) {
		int result=0;
		
		for (int i= 0; i < number.length; i++) {
		result=result+number[i];
		
		}
		return result;
		
	
	}

}


/**
3. Write a method that takes an array of int parameter and return the sum of all the
elements
Access Modifier: public
Non-Access Modifier: static
Return Type: int
Method Name: getTotal
Parameter1: int [] number
Test Data:
getTotal ([6, 1, 2, 3]) ----- 12
getTotal ([13, 6, 1, 2, 3]) ----- 25
getTotal ([0, 1, 4, 3 ,6]) ----- 14
getTotal ([0, 6, 0]) ----- 6



*/