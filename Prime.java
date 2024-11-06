import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases (t): ");
        int t = sc
        anner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter a number (n) to check for primality: ");
            int n = scanner.nextInt();

            int count = 0; // Initialize count to 0 for each test case
            boolean isPrime = true; // Assume prime initially

            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    isPrime = false; // Not prime if divisible by any number
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }

        scanner.close(); // Close the Scanner to avoid resource leaks
    }
        }
