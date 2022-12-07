public class Student {
    private int age;
    private String name;

    public Student() {
        setAge(0);
        setName("");
    }

    public Student(int age) {
        //this.age = age;
        setAge(age);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student daniyar =  new Student();
        Student test =  new Student(18);
        Student test2 = new Student(18, "Danik");
        System.out.println(daniyar.getAge());
        System.out.println(daniyar.getName());

        System.out.println(test.getAge());
        System.out.println(test2.getAge());
        System.out.println(test2.getName());
    }
}
