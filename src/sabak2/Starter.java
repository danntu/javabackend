package sabak2;

import sabak2.Person;

public class Starter {
    public static void main(String[] args) {
        Person person = new Person();


        person.setAge(34);
        System.out.println(person.getAge());
        System.out.println(person.max(136,78));



    }
}
