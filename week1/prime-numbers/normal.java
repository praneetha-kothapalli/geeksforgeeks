//program to certain number
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

//program for 1 to n
class PrimeNumbers {
    // Function to check prime
    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n == 2 || n == 3) return true;

        // check divisibility from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50; // upper limit
        System.out.println("Prime numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

