public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super(); // gọi constructor mặc định của Circle
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color, true); // hoặc thêm constructor (radius, color) vào Circle
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() +
                ", color=" + getColor() +
                ", height=" + height +
                ", volume=" + getVolume() + "]";
    }
}
