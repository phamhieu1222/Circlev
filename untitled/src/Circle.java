public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        this.filled = true;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.filled = true; // hoặc giá trị mặc định
    }


    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        this.filled = true;
    }

    // 🛠 Đây là constructor bạn cần thêm
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
    }
}
