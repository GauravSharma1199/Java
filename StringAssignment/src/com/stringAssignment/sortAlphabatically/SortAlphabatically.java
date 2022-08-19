package com.stringAssignment.sortAlphabatically;

import java.util.Scanner;

public class SortAlphabatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=============WAP to sort a String Alphabetically.===========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String st = sc.nextLine();
		st = st.toLowerCase();
		SortAlphabatically sortAlphabatically = new SortAlphabatically();
		char[] out = sortAlphabatically.sort(st.toCharArray());
		System.out.print("output: ");
		System.out.println(out);
	}
	public char[] sort(char[] charArr) {
		char temp;
		for(int i=0; i<charArr.length; i++) {
			for(int j=i+1; j<charArr.length; j++) {
				if(charArr[i] > charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		return charArr;
	}

}
