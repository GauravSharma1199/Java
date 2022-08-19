package com.stringAssignment.isPanagram;

public class IsPanagram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		IsPanagram isPanagram = new IsPanagram();
		if(isPanagram.isPanagram(str)) {
			System.out.print("The String is a Pangram String.");
		}else {
			System.out.print("The String is not a Pangram String.");
		}
	}
	
	public boolean isPanagram(String st) {
		boolean response = true;
		int position = 0;
		boolean[] values = new boolean[26];
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
				position = st.charAt(i) - 'A';
			}else if(st.charAt(i) >='a' && st.charAt(i) <= 'z') {
				position = st.charAt(i) - 'a';
			}
			values[position] = true;
		}
		for(int i=0; i<values.length; i++) {
			if(values[i] == false) {
				return false;
			}
		}
		return response;
	}

}
