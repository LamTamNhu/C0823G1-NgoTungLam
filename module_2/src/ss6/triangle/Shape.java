package ss6.triangle;

abstract class Shape {
    String color;

    Shape() {

    }

    Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
