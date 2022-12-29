package sabak9;

public  class Person {
    String name;
    protected String getName(){
        return name;
    }

    private Person(String name){
        this();
        this.name=name;
        getName();
    }

    public Person() {
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}

class Employee extends Person{



    @Override
    public String getName() {
        return super.getName();
    }

    //constructor
    public Employee(String name){
       // super(name);
        System.out.println();

    }


    // variable and variable
    public void test(){
        System.out.println(super.name + super.getName());
    }


    public static void main(String[] args) {
        Person p =  new Employee("Text");
        ((Employee)p).test();
    }

}
