public class PrimeArray {
    // Function to check if a number is prime
    public static boolean isPrime(int N) {
        if (N <= 1) return false; // 1 and below are not prime
        for (int i = 2; i <= Math.sqrt(N); i++) { // Check up to √N
            if (N % i == 0) return false;
        }
        return true;
    }

    // Function to reverse an array
    public static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] primes = new int[10]; // Array to store first 10 primes
        int cnt = 0; // Count of primes found
        int num = 2; // Start checking from 2

        // Find and store the first 10 primes
        while (cnt < 10) {
            if (isPrime(num)) {
                primes[cnt] = num; // Store prime in array
                cnt++;
            }
            num++;
        }

        // Print the first 10 primes
        System.out.println("First 10 prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

        // Reverse the array
        int[] reversedPrimes = reverseArray(primes);

        // Print the reversed array
        System.out.println("Reversed array of primes:");
        for (int prime : reversedPrimes) {
            System.out.print(prime + " ");
        }
    }
}