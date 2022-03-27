package P19cylinder;

public class Cylinder extends Circle {
    private double height;
  // use 'super' and 'this' to get the Area, height, radius
    public Cylinder (double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public double getArea() {
        return getArea() * height;
    }
}
