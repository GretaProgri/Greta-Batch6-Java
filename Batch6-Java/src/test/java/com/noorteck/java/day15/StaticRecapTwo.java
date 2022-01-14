package com.noorteck.java.day15;

public class StaticRecapTwo {

	public static void getInfo() {

		StaticRecapOne.isJavaFun=true;

		StaticRecapOne.totalAmount = 1111;

		System.out.println(StaticRecapOne.isJavaFun);

		System.out.println(StaticRecapOne.totalAmount);

		StaticRecapOne.addNum(2, 4);
		

	}

	public void statusUpdate() {

		StaticRecapOne obj = new StaticRecapOne();

		obj.month = "January";

		obj.iLikeJava = "Java is Life";

		System.out.println(obj.month);
		System.out.println(obj.iLikeJava);

		obj.getCountry();

	}

	public static void main(String[] args) {

		getInfo();
	}
	
}
