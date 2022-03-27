package homeworkweek08;

import java.util.Scanner;

public class P10ArmstrongNumber {
    public static void armstrong() {
        int num, num1, num2, total = 0;
        System.out.println("Please Enter The Number:");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        obj.close();
        num1 = num;
        for (; num1 != 0; num1 /= 10) {
            num2 = num1 % 10;
            total = total + num2 * num2 * num2;
        }
        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
    public static void main(String[] args) {
        armstrong();
    }
}

