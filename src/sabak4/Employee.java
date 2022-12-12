package sabak4;

public class Employee extends Person{
    private String title;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public static void main(String[] args) {


        Employee employee = new Employee("Daniyar",36,'M');

        //employee.name = "Daniyar";
        //employee.age=36;
        //employee.gender='M';

//        employee.setName("Daniyar");
//        employee.setAge(36);
//        employee.setGender('M');

        employee.setTitle("Teacher");



        System.out.println(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "title='" + title + '\'' +
                "name="+ getName()+" "+
                "age="+ getAge()+ " "+
                "gender="+ getGender()+
                '}';
    }
}
