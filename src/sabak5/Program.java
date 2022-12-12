package sabak5;

public class Program {
    public static void main(String[] args) {
        Person per = new Person();
        per.age = 13;
        per.displayInfo();

        Person tom = new Person(34);
        tom.displayInfo();
    }
}
