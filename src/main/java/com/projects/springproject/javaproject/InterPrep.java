package com.projects.springproject.javaproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterPrep {
    public static void main(String args[]) {
        List<String> strList = Arrays.asList("apple", "cat", "anchor", "axe", "banana", "air");

        List<String> startswithAandUppercase = strList.stream().filter(input -> input.startsWith("a") && input.length() > 3).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(startswithAandUppercase);

        int []nums= {1,1,1};
        int k=2;
        System.out.println(sumArray(nums,k));
    }

    private static int sumArray(int[] nums, int k) {
        int count=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]+nums[i+1]==k){
                count ++;
            }
        }
        return count;
    }
}
