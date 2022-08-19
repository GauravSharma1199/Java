package com.stringAssignment.reverseStringPreservePosition;

import java.util.Scanner;

public class ReverseStringPreservePosition {

	public static void main(String[] args) {
		System.out.println("======Reverse sentence while preserving position======");
		System.out.print("input: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] stArr = input.split(" ");
		String output = "";
		ReverseStringPreservePosition reverseString = new ReverseStringPreservePosition();
		for(int i=0; i<stArr.length; i++) {
			output += reverseString.reverseStringWithLowerCase(stArr[i]);
			if(stArr.length > 0 && i<stArr.length-1) {
				output += " ";
			}
		}
		System.out.print("output: "+ output);
		
	}
	public String reverseStringWithLowerCase(String st) {
		String response = "";
		for(int i=st.length()-1; i>=0; i--) {
			if ((char)st.charAt(i) >= 'A' && (char)st.charAt(i) <= 'Z') {
				response += (char) ((char)st.charAt(i) + 32);				
			}else {
				response += st.charAt(i);
			}
			
		}
		return response;
	}

}
