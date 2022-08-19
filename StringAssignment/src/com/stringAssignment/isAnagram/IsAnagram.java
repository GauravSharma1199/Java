package com.stringAssignment.isAnagram;

import java.util.Scanner;

public class IsAnagram {
	public static void main(String[] args) {
		System.out.println("=======Given strings is anagram or not========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();
	    IsAnagram isAnagram = new IsAnagram();
	    if(isAnagram.isAnagram(s1, s2)) {
	    	System.out.println("The two strings are anagram of each other");
	    }else {
	    	System.out.println("The two strings are not anagram of each other");	    	
	    }
	 
	}
	
	public boolean isAnagram(String st1, String st2) {
		char[] st1Arr = st1.toCharArray();
		char[] st2Arr = st2.toCharArray();
		int n1 = st1Arr.length;
		int n2 = st2Arr.length;
		if(n1 != n2) {
			return false;
		}
		IsAnagram isAnagram = new IsAnagram();
		char[] st1SortArr = isAnagram.sort(st1Arr);
		char[] st2SortArr = isAnagram.sort(st2Arr);
		for(int i=0; i <n1; i++) {
			if(st1SortArr[i] != st2SortArr[i]) {
				return false;
			}
		}
		return true;
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
