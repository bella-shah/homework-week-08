package homeworkweek08;

public class P11EvenDigitSum {
    public static void even() {
        getEvenDigitSum(123456789);
    }

    public static int getEvenDigitSum(int num) {
        int sum = 0;
        if (num > 0) {
            // use while and if-else condition
            while (num != 0) {
                int even = num % 10;
                if (even % 2 == 0) {
                    sum += even;
                }
                num /= 10;
            }
            System.out.println("The total is : " + sum);
        }
        return -1;
    }

    public static void main(String[] args) {
        even();
    }
}





