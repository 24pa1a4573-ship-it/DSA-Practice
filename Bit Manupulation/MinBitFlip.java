//A bit flip of a number x is choosing a bit in the binary representation of x and flipping it from either 0 to 1 or 1 to 0.

class Solution {
    public int minBitFlips(int start, int goal) {

        int count = 0;

        while (start != 0 || goal != 0) {

            int bit1 = start & 1;
            int bit2 = goal & 1;

            if (bit1 != bit2) {
                count++;
            }

            start = start >> 1;
            goal = goal >> 1;
        }

        return count;
    }
}
