package sabak4;

public class Driver extends Person {
    public String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public Driver(String name, int age, char gender, String title) {
        super(name, age, gender);
        setTitle(title);
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Dauren",37, 'M', "VIP Driver" );
        //driver.name="Dauren";
        //driver.age=37;
        ///driver.gender='M';
//        driver.title="VIP Driver";
//        driver.setName("Dauren");
//        driver.setAge(37);
//        driver.setGender('M');
        System.out.println(driver);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "title='" + title + '\'' +
                "name="+ getName()+" "+
                "age="+ getAge()+ " "+
                "gender="+ getGender()+
                '}';
    }

}
