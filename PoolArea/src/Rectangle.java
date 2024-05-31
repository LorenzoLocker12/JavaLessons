public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length > 0 ? length : 0;
        this.width = width > 0 ? width : 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

}
