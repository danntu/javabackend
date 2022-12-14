package sabak3;

public class Employee extends Person{

//    @Override
//    public int getExpert() {
//        return 456;
//    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

//    @Override
//    int getAge() {
//        return super.getAge();
//    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setAge(6);

//        employee.getExpert();

        System.out.println(employee.getAge());
    }
}
