package homeworkweek08;

import java.util.Scanner;

public class P4DigitSumChallenge {
    public static void sum() {
        int number;
        int digit;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        number = obj.nextInt();
        while (number > 0) {//Extract the least significant digit with (n%10) & (n/10)
            digit = number % 10;
            number = number / 10;
            sum = sum + digit;
        }
        System.out.println("The Sum of Digits is : " + sum);
    }

    public static void main(String args[]) {
        sum();
    }
}