package sabak6;

public class Square extends Rectangle{

    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int length){
        super();
        this.length = length;
    }

    @Override
    public int calculatePerimeter() {
        sides = 4;
        return 4*length;
    }

    public int calculatePerimeter(int length) {
        sides = 4;
        return 4*length;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("calculatePerimeter with param " +
                rectangle.calculatePerimeter(6,6));
        System.out.println(rectangle.calculatePerimeter());

        Square square =  new Square(2);
        System.out.println(square.calculatePerimeter());
        System.out.println(square.calculatePerimeter(16));


    }
}
