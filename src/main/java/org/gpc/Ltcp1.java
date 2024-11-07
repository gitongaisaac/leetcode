package org.gpc;

import java.util.Arrays;

public class Ltcp1 {
    public static String twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                sum = nums[j] + nums[i];

                if (sum == target) {
                    indexes[0] = j;
                    indexes[1] = i;

                    break;
                } else  {
                    sum = 0;
                }
            }
        }

        return Arrays.toString(indexes);
    }
    public static void main(String[] args) {
//  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//  You may assume that each input would have exactly one solution, and you may not use the same element twice.
//  You can return the answer in any order.
        int[] nums = {3, 3};
        System.out.println(twoSum(nums, 5));
    }
}  
