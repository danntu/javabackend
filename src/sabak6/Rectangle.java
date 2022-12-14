package sabak6;

public class Rectangle extends Shape {
    @Override
    double calculateArea() {
        return 5*6;
    }

    int length;
    int width;
    int sides;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public int calculatePerimeter() {
        return 2 * (length) + 2 * (width);
    }

    public int calculatePerimeter(int length, int width) {
        return 2 * (length) + 2 * (width);
    }


}
