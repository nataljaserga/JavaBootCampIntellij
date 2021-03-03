package activity;

public class Rectangle extends Shape{
    public double length;
    public double breadth;

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return this.breadth*this.length;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(this.breadth+this.length);
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
