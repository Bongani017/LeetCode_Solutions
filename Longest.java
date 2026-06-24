package com.example;
import java.util.*;

public class Longest {
	
	public static String Prefix(String[] words) {
		if(words== null || words.length ==0) return "";
		
		String prefix = words[0];
		
		for(int i=1;i<words.length;i++) {
			while(!words[i].startsWith(prefix)) {
				prefix = prefix.substring(0,prefix.length()-1);
				
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		String[] words = new String[n];
		
		for(int i=0;i<n;i++) {
			words[i] = in.nextLine();
		}
		
		System.out.println(Prefix(words));
		
		// TODO Auto-generated method stub

	}

}
