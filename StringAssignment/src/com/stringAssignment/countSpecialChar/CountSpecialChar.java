package com.stringAssignment.countSpecialChar;

import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		System.out.println("============= WAP to count number of special characters. ===========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String st = sc.nextLine();
		int count = 0;
		for(int i=0; i<st.length(); i++) {
			if( (st.charAt(i) > 32 && st.charAt(i) < 48) ||
					(st.charAt(i) > 57 && st.charAt(i) < 65) || 
					(st.charAt(i) > 90 && st.charAt(i) < 97) ||
					(st.charAt(i) > 122 && st.charAt(i) < 127)) {
				count += 1;
			}
		}
		
		System.out.println("output: " + count);

	}

}
