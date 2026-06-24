package com.example;
import java.util.*;

public class MedianOfArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        double[] nums1 = new double[m];
        double[] nums2 = new double[n];

        for(int i = 0; i < m; i++) {
            nums1[i] = in.nextDouble();
        }

        for(int i = 0; i < n; i++) {
            nums2[i] = in.nextDouble();
        }

        System.out.println(Median(nums1, nums2));
    }

    public static double Median(double[] nums1, double[] nums2) {

        ArrayList<Double> mixedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        // Merge the arrays
        while(i < nums1.length && j < nums2.length) {

            if(nums1[i] <= nums2[j]) {
                mixedArray.add(nums1[i]);
                i++;
            }
            else {
                mixedArray.add(nums2[j]);
                j++;
            }
        }

        // Add remaining elements from nums1
        while(i < nums1.length) {
            mixedArray.add(nums1[i]);
            i++;
        }

        // Add remaining elements from nums2
        while(j < nums2.length) {
            mixedArray.add(nums2[j]);
            j++;
        }

        int size = mixedArray.size();

        // Odd length
        if(size % 2 != 0) {
            return mixedArray.get(size / 2);
        }

        // Even length
        return (mixedArray.get(size / 2) +
                mixedArray.get((size / 2) - 1)) / 2.0;
    }
}