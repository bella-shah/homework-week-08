package homeworkweek08;

import java.util.Scanner;

public class P8TrianglePattern {
    public static void pattern() {
        int i, a, rows;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        rows = obj.nextInt();
         // use for loop syntax to store the value
        for (i = 1; i <= rows; i++) {
            for (a = 1; a <= i; a++) {
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern();
    }
}
