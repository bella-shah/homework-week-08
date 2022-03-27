package homeworkweek08;

    public class P13SharedDigits {
        public static void main(String[] args) {
            P13SharedDigits obj = new P13SharedDigits();
            System.out.println("The shared Digits are: ");
            System.out.println(obj.hasSharedDigit(12, 23));
            System.out.println(obj.hasSharedDigit(9, 99));
            System.out.println(obj.hasSharedDigit(15, 55));
        }
         // to use boolean with if else condition
        public static boolean hasSharedDigit(int num1, int num2) {
            if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
                return true;
            }else
                return false;

        }
    }

