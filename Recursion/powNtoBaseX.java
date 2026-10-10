// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

class Solution {

    public double helper(double x, long n) {

        if (n == 0)
            return 1.0;

        if (n % 2 == 1)
            return x * helper(x * x, n / 2);

        return helper(x * x, n / 2);
    }

    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return helper(x, N);
    }
}
