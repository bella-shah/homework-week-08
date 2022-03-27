package homeworkweek08;

import java.util.Scanner;

public class P1ReadingUserInputChallenge {
    public static void test() {
        int i = 1;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        while (i <= 10) {
            sum += obj.nextInt();
            if (obj.hasNextInt()) {
                i++;
            }
            // System.out.println("The total sum is: " + sum);
        }
        System.out.println("The total sum is: " + sum);
        System.out.println("Invalid Number");
        obj.close();
    }

    public static void main(String[] args) {
        test();
    }
}
