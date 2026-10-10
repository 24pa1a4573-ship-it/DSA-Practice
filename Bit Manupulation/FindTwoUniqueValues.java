// Problem Statement: Given an array nums of length n, every integer in the array appears twice except for two integers. 
//   Identify and return the two integers that appear only once in the array. Return the two numbers in ascending order.

// For example, if nums = [1, 2, 1, 3, 5, 2], the correct answer is [3, 5], not [5, 3].


class Solution {
    public int[] singleNumber(int[] nums) {

        int xor = 0;

        // XOR of all numbers
        for (int num : nums) {
            xor ^= num;
        }

        // Find a bit where the two unique numbers differ
        int bit = xor & -xor;

        int a = 0;
        int b = 0;

        // Divide numbers into two groups
        for (int num : nums) {
            if ((num & bit) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        if (a < b)
            return new int[]{a, b};
        else
            return new int[]{b, a};
    }
}
