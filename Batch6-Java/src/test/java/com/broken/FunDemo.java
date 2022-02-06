package com.broken;

public class FunDemo {public static void main(String[] args) {
	
	//The Grandpa Object	
	TheGrandPa grandpaObj = new TheGrandPa();
			
	grandpaObj.country = "USA";		
	grandpaObj.setCountry("USA");	
	System.out.println(grandpaObj.getCountry());
	
//	grandpaObj.addNum(2,5); cant access it It is private
	grandpaObj.display();
	
	
	//grandpaObj.setAge(66); Not variable age present on TheGrandPa
//	System.out.println(grandpaObj.getAge()); therefore cant print
	
 
	
	//TheDad object
	
	TheDad dadObj = new TheDad();
	
	dadObj.age = 12;
	dadObj.setAge(33);		
	System.out.println(dadObj.age);
	//dadObj.favNumWho(7); This method doesnt exist in TheDad
	dadObj.setCountry("Canada");
	System.out.println(dadObj.getCountry());
	
	
	//TheSon object 
	TheSon sonObj = new TheSon();
	
	sonObj.setGrade('A');
	
	sonObj.getGrade();
	System.out.print(sonObj.getGrade());
	
	//sonObj.addNum(3, 5); Not visitible
	
	sonObj.setCity ( "Reston"); 
	
	System.out.println(sonObj.getCity());// Therefore Cant print
	
//	sonObj.trapZone();//not visible from TheSon Class
	
	sonObj.moreTrap('A');
	
	System.out.println("Yes :)");
}


}
