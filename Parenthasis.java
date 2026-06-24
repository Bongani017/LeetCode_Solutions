package com.example;
import java.util.*;

public class Parenthasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = in.nextInt();
		}
		
		System.out.println(nonRepeat(nums));
		
		

	}
	public static int nonRepeat(int[] nums) {
		int unique = 0;

	    for (int n : nums) {
	        unique ^= n;
	    }

	    return unique;
	}

}
