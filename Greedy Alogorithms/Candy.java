// There are n children standing in a line.

// Each child is assigned a rating value given in the integer array ratings.

// You are giving candies to these children subjected to the following requirements:

// Each child must have at least one candy.
// Children with a higher rating get more candies than their neighbors.
// Return the minimum number of candies you need to have to distribute the candies to the children.

 

// Example 1:

// Input: ratings = [1,0,2]
// Output: 5
// Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.

class Solution {
    public int candy(int[] ratings) {
        if (ratings.length == 1)
            return 1;
        int[] left = new int[ratings.length];
        left[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                left[i] = left[i - 1] + 1;
            else
                left[i] = 1;
        }
        int sum = 0, prev = 1;
        sum = sum + Math.max(left[ratings.length - 1], 1);
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                prev++;
            } else {
                prev = 1;
            }
            sum += Math.max(left[i], prev);
            System.out.println(sum);
        }
        return sum;
    }
}
