package sabak6;

public class Starter {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog shaha = (Dog) dog;
        shaha.makeSound();
        shaha.fetch();

        Animal cat =  new Cat();
       // Dog cat2 = (Dog)cat;
       /// cat2.makeSound();



        Shape shape = new Circle();
        System.out.println(shape.calculateArea());

        shape = new Rectangle();
        System.out.println("Rectangle "+ shape.calculateArea());

    }
}
