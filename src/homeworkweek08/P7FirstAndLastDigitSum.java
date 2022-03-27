package homeworkweek08;

public class P7FirstAndLastDigitSum {
    public static void sum(){
        sumFirstAndLastDigit(252);
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number > 9) {
                number = number / 10;
            }
            System.out.println("First Digit " + number + " Last Digit  " + lastDigit + " Sum = " + (number + lastDigit));
            return 0;
        } else
            System.out.println("-1");
        return -1;
    }

    public static void main(String[] args) {
        sum();
    }
}

