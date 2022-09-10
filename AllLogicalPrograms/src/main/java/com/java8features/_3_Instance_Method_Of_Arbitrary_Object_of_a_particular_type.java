package com.java8features;

import java.util.Arrays;

//Four types of method references
//1. Method reference to an instance method of an object – object::instanceMethod
//2. Method reference to a static method of a class – Class::staticMethod
//3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod
//4. Method reference to a constructor – Class::new

//3. Method reference to an instance method of an arbitrary object of a particular type – Class::instanceMethod

public class _3_Instance_Method_Of_Arbitrary_Object_of_a_particular_type {

	public static void main(String[] args) {
		String[] stringArray= {"Amar","Raj","Rahul","PK","Soma"};
		/*
		 * Method reference to an instance method of an arbitrary //object of a
		 * particular type
		 */		
//		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String str:stringArray) {
			System.out.println(str);
		}
	}
}