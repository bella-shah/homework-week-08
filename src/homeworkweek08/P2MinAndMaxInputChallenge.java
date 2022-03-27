package homeworkweek08;

import java.util.Scanner;

public class P2MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Max Int:" + max);
        System.out.println("Min Int:" + min);
        while (true) {
            System.out.println("Enter a Number:");
            //Validating syntax for integer number
            boolean isAntInt = obj.hasNextInt();
            if (isAntInt) {
                //store a valid number
                int number = obj.nextInt();
                //if number is bigger than last max number than store in max variable
                if (number > max) {
                    max = number;
                    System.out.println("If max true: " + max);
                }
                if (number < min) {
                    min = number;
                    System.out.println("If Min true" + min);
                } else {
                    System.out.println("Invalid Number");
                    break;
                }
                obj.nextLine();
            }
            System.out.println("Maximum : =" + " and Minimum : =" + min);
            obj.nextLine();
        }
    }

}










