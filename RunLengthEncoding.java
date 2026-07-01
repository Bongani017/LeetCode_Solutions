package com.example;
import java.util.*;

public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		System.out.println(compress(s));

	}
	
	public static String compress(String s) {

	    if(s.length() == 0)
	        return "";

	    StringBuilder result = new StringBuilder();

	    int count = 1;

	    for(int i = 1; i < s.length(); i++) {

	        if(s.charAt(i) == s.charAt(i - 1)) {
	            count++;
	        }
	        else {

	            result.append(s.charAt(i - 1));

	            if(count > 1)
	                result.append(count);

	            count = 1;
	        }
	    }

	    // Don't forget the last group!
	    result.append(s.charAt(s.length() - 1));

	    if(count > 1)
	        result.append(count);

	    String compressed = result.toString();

	    if(compressed.length() < s.length())
	        return compressed;

	    return s;
	}

}
