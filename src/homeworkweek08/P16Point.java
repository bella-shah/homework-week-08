package homeworkweek08;

public class P16Point {
    private int x;
    private int y;


    public static void main(String[] args) {
        P16Point first = new P16Point(6, 5);
        P16Point second = new P16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        P16Point point = new P16Point();
        System.out.println("distance()= " + point.distance());
    }

    // constructor
    public P16Point() {
    }

    public P16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //set
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(P16Point another) {
        return distance(another.x, another.y);
    }
}


