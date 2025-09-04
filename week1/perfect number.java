//perfect number program
//if i is a divisor then n/i is also an divisor
class Perfect {
    static boolean isPerfect(int n)
    {
        // 1 is not a perfect number
        if (n == 1)
            return false;
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n)
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }
        if (sum == n)
            return true;
        return false;
    }
}
