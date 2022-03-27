package homeworkweek08;

import java.util.Scanner;

public class P12PrimeNumbers {
    public static void prime() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = obj.nextInt();
        if (checkPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // used boolean for true and flase condition
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        prime();
    }
}

