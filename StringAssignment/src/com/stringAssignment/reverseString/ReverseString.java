package com.stringAssignment.reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("==========Please enter string for reverse=========");
		System.out.print("input: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		ReverseString revString = new ReverseString();
		String output = revString.reverseString(st);
		System.out.println("output: " + output);
	}
	
	public String reverseString(String st) {
		String response = "";
		for(int i=st.length()-1; i>=0; i--) {
			response += st.charAt(i);
		}
		return response;
	}

}
