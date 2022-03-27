package homeworkweek08;

import java.util.Scanner;

public class P14DiamondPattern {
    public static void diamond(){
        int n, i, a, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        // use for loop for storing the number
        for (a = 1; a <= n; a++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * a - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (a = 1; a <= n - 1; a++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - a) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        diamond();
    }
}