package sabak8;

public class AccessExample {


    public int age;  // variable

    protected char sex;

    private String name;

    String color;

    private String getName() {
        return name;
    }

    public int getAge() {     // method
        return age + Integer.valueOf(getName());
    }

    protected AccessExample() {
    }

    public AccessExample(int age) {    //constructor
        this.age = age;
    }


}
