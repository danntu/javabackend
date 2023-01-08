package metanit;

public class Program{

    public static void main(String[] args) {

        Person2 tom = new Person2();
        tom.displayInfo();
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();

        changeName(tom);
        tom.displayInfo();
    }

    static void changeName(Person2 p){

        p.setName("Alice");
    }
}
class Person2{

    {
        this.name = "Undefined";
        this.age = 18;
    }

    static{
        counter = 105;
        System.out.println("Static initializer");
    }
    public Person2() {
        //this("Undefined", 18);
    }

    Person2(String name1, int age1)
    {
        this.name = name1;
        this.age = age1;
        this.displayInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static int counter=1;

    String name;    // имя
    int age;        // возраст

    public static final double PI = 3.14;

    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }

    void displayInfo(){
        counter++;

        System.out.println(this.age);
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}