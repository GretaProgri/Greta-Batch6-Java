package com.noorteck.java.day24;

public class Day24ExerciseOne {
	
	public static void main(String[] args) {
		int n1[]= {6,1,2,3};
		int n2[]= {13,6,1,2,3};
		int n3[]= {0,1,4,3,6};
		int n4[]= { 0,6,0};
		boolean resultOne= isFirstLast(n1);
		boolean resultTwo=isFirstLast(n2);
		boolean resultThree=isFirstLast(n3);
		boolean resultFour=isFirstLast(n4);
		
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
		System.out.println(resultFour);
		
		
		
		
		
	}
		
		
		static boolean isFirstLast(int[] number)  {
			boolean result= false; 
			
			int firstElement= number[0];
			int lastElement= number [number.length-1];
			if (firstElement==6 || lastElement==6) {
				result=true;
				
			
			}
			
			return result;

		}
 
	}	
 





/**
1. Write a method that takes an array of int parameter and return true if 6 appears as
either the first element or last element in the array, otherwise return false
Access Modifier: Default
Non-Access Modifier: static
Return Type: boolean
Method Name: isFirstLast
Parameter1: int [] number
Test Data:
isFirstLast ([6, 1, 2, 3]) ----- TRUE
isFirstLast ([13, 6, 1, 2, 3]) ----- FALSE
isFirstLast ([0, 1, 4, 3 ,6]) ----- TRUE
isFirstLast [0, 6, 0]) ----- FALSE




*/