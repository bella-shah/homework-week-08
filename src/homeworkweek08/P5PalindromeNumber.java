package homeworkweek08;

public class P5PalindromeNumber {

    public static void isPalindrome(){
        isPalindrome(222);
    }
    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int lastDigit = 0;
        Integer num = Integer.valueOf(number);
        //use while loop syntax
        while (number != 0) {
            lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }
        if (reversedNum == num) {
            System.out.println("It's a palindrome");
        } else
            System.out.println("Not a palindrome");
        return false;
    }

    public static void main(String[] args) {
        isPalindrome();
    }
}











