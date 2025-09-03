//power(x,n)
class Solution {
    public double myPow(double x, int n) {
        // use long to avoid overflow for -2^31
        long exp = n;
        if (exp < 0) {
            x = 1 / x;   // reciprocal for negative powers
            exp = -exp;
        }

        double ans = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1) {   // if odd
                ans *= x;
                exp -= 1;
            } else {              // if even
                x *= x;
                exp /= 2;
            }
        }
        return ans;
    }
}
