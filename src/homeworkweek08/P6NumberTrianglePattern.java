package homeworkweek08;

import java.util.Scanner;

public class P6NumberTrianglePattern {
    public static void triangle() {
        int i, a, b;
        System.out.print("Enter number of rows : ");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        // use for loop syntax to make the triangle pattern
        for (i = 1; i <= b; i++) {
            for (a = 1; a <= i; a++)
                System.out.print(a);
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        triangle();
    }
}
