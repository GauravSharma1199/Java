package com.stringAssignment.findVowelAndConst;

import java.util.Scanner;

public class FindVowelAndConst {

	public static void main(String[] args) {
		System.out.println("=============WAP to count the number of Vowels and Consonants of a String value===========");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String st = sc.nextLine();
		st = st.toLowerCase().replace(" ", "");
		int vowels=0;
		int consonants = 0;
		char[] vowelsArr = new char[26];
		char[] consonantsArr = new char[26];
		String vowelSt="";
		String consonantSt="";
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				if(st.charAt(i) == 'a'||
					st.charAt(i) == 'e'||
					st.charAt(i) == 'i'||
					st.charAt(i) == 'o'||
					st.charAt(i) == 'u') {
					vowelsArr[st.charAt(i)-'a'] = st.charAt(i);
				}else {
					consonantsArr[st.charAt(i)-'a'] = st.charAt(i);
				}
			}
		}
		for(int i=0; i<vowelsArr.length; i++) {
			if(vowelsArr[i] >= 'a' && vowelsArr[i] <= 'z') {
				vowels += 1;
				vowelSt += vowelsArr[i];
			}
		}
		for(int i=0; i<consonantsArr.length; i++) {
			if(consonantsArr[i] >= 'a' && consonantsArr[i] <= 'z') {
				consonants += 1;
				consonantSt += consonantsArr[i];
			}
		}
		System.out.println("vowels: " + vowelSt);
		System.out.println("consonants: " + consonantSt);
		System.out.println("output:- Vowels:" + vowels + ", Consonants:" + consonants);

	}

}
