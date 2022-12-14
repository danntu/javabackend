package sabak6;

public  class Circle extends Shape{
    @Override
    double calculateArea() {
        int r = 4;
//        return Math.PI*r*r;
        return Math.PI * Math.pow(r,2);
    }
}
