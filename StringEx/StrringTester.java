package com.basics;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String country="India";
      boolean nation=country.isEmpty();
      System.out.println(nation);
      
      String count=country.toUpperCase();
      System.out.println(count);      
      
      char st=count.charAt(2);
      System.out.println(st);      

      count=count.toLowerCase();
      System.out.println(count);   
      
      if(country==count) {
    	  System.out.println("Both strings are equal");
      }
      else
      {
    	  System.out.println("Both strings are not equal");

      }

	}

}
