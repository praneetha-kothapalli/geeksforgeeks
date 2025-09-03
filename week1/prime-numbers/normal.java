class PrimeCheck {
    static boolean isPrime(int n) {
        // 1 and below are not prime
        if (n <= 1) return false;

        // 2 and 3 are prime
        if (n == 2 || n == 3) return true;

        // check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false; // found a divisor
        }

        return true; // no divisors found → prime
    }

    public static void main(String[] args) {
        int n = 29;
        if (isPrime(n))
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}
