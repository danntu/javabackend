package metanit;

class Employee extends Person{
    String name = "Test";
    public Employee(String name){
        super(name);
        System.out.println(super.name);
        super.display();// если базовый класс определяет конструктор
        //  то производный класс должен его вызвать
    }

    @Override
    public void display() {
        System.out.println("New Name " + name);

    }

    public static void main(String[] args) {
        Person employee =  new Employee("Dan");

        ((Person)employee).display();

  HumanDan humanDan =  new HumanDan();

  humanDan.getName();

    }

}

class HumanDan extends  Human{

}


 abstract class Human{

    private String name;

    public String getName() { return name; }
}



