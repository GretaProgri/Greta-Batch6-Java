package com.broken;

public class TheSon extends TheDad{
	
private char grade;
	
	public final boolean IS_JAVA_FUN = false;
	public final String MY_STATE = "VA";


	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public char getGrade() {
		
		
		//System.out.println(grade);
		return grade;
		
	}
	
	
	private void trapZone() {
		char myGrade;
		
		int myFavNumber=0;	
		System.out.println("My FavNumber" + myFavNumber);
		
		String teamName="Team";		
		System.out.println("My Team Name: " + teamName);
		
		
		String schoolName="NYU";		
		System.out.println("My School Name: "+ schoolName);
		
	
		grade = 12;
		System.out.println("My Grade: " + grade);
		
		
		age= 12;		
		System.out.println("My Age"+ age);
		 
		country = "USA";	
		System.out.println("Country :" + country);
		
		//IS_JAVA_FUN = false;// IT IS FINAL
			
	}

	
	public void moreTrap(char grade) {
		this.grade = grade;
		
	//	MY_STATE = "CA"; cant change value bc it is final
		
	
	
		
			TheGrandPa obj=new TheGrandPa();
			setCountry("USA"); 
		
			obj.getCountry();
		

			obj.setCity("R");
			obj.getCity();
		
		double age =(12.2);
		int age1 = 22;
				
	//	addNum(3,4); cant access it as it is private in THE GRANDPA
	
		display();
		
		trapZone();
	
	}
	 
	

}
