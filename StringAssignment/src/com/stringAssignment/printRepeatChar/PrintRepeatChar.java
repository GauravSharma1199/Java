package com.stringAssignment.printRepeatChar;

import java.util.Scanner;

public class PrintRepeatChar {

	public static void main(String[] args) {
		System.out.println("=============WAP to print repeatedly occurring characters in the given String===========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String st = sc.nextLine();
		st = st.toLowerCase();
		String ans="";
		char[] res = new char[26];
		int index = 0;
		for(int i=0; i<st.length(); i++) {
			for(int j=i+1; j<st.length(); j++) {
				if((st.charAt(i) == st.charAt(j)) && (st.charAt(i) >= 'a' && st.charAt(i) <='z') ) {
					res[st.charAt(i) - 'a'] = st.charAt(i);
					break;
				}
			}
		}
		for(int i=0; i<res.length; i++) {
			if(res[i] >= 'a' && res[i] <='z') {
				ans += res[i];
			}
		}
		System.out.println("output: " + ans);

	}

}
