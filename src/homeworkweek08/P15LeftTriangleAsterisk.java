package homeworkweek08;

public class P15LeftTriangleAsterisk {
    public static void asterisk() {
        int i, a, row = 6;
       //use the for loop codition
        for (i = 0; i < row; i++) {
            for (a = 2 * (row - i); a >= 0; a--) {
                System.out.print(" ");
            }
            for (a = 0; a <= i; a++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        asterisk();
    }
}
