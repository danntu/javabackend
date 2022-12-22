package sabak7;

import sabak8.AccessExample;

import static java.lang.System.out;

public class Person extends AccessExample{

    private  int age = 18;





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        this(5);
        out.println(sex);
        System.out.println("Super class");




    }

    public Person(int age) {
        super();
        this.age = age;
        this.getAge();
    }

    public void test(){
        getAge();
    }


    public static void main(String[] args) {
        AccessExample accessExample = new AccessExample(12);
        accessExample.getAge();
        out.println(accessExample.age);
    }



}
