package com.noorteck.selenium.day7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Recap {
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> s1 = new LinkedHashMap<String, String>();
		s1.put("FirstName", "Abdullah");
		s1.put("LastName", "Haji");
		s1.put("City", "Reston");
		s1.put("Salary", "55");
		LinkedHashMap<String, String> s2 = new LinkedHashMap<String, String>();
		s2.put("FirstName", "Shahed");
		s2.put("LastName", "Alramdani");
		s2.put("City", "Sterling");
		s2.put("Salary", "99");
		LinkedHashMap<String, String> s3 = new LinkedHashMap<String, String>();
		s3.put("FirstName", "Eric");
		s3.put("LastName", "White");
		s3.put("City", "Ashburn");
		s3.put("Salary", "77");
		LinkedHashMap<String, String> s4 = new LinkedHashMap<String, String>();
		s4.put("FirstName", "Sabir");
		s4.put("LastName", "Omar");
		s4.put("City", "Aldie");
		s4.put("Salary", "66");
		LinkedHashMap<String, String> s5 = new LinkedHashMap<String, String>();
		s5.put("FirstName", "Abdullah");
		s5.put("LastName", "XYZ");
		s5.put("City", "Sterling");
		s5.put("Salary", "44");
		
		
		
		List<String> a = new ArrayList<String>();
		List<Integer> b = new ArrayList<Integer>();
		List<Character> c = new ArrayList<Character>();
		List<Double> d = new ArrayList<Double>();
		
		
		
		List<LinkedHashMap<String, String>> studentList = new  ArrayList<LinkedHashMap<String, String>>();
		
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		System.out.println(studentList);

		
		
		
	}



}
