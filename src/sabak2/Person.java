package sabak2;

public class Person {
    // 1) variable
    private int age;

    // 2 Constructor
    protected Person(){
        age = 0;
    }

    // 3 Method

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int max (int age1, int age2){
        if (age1>age2) return age1;
        else return age2;
    }

    private boolean checkAge(int age){
        if (age > 18) return true;
        else
            return false;
    }








    public static void main(String[] args) {

        Person danik = new Person();
        Person daulet = new Person();

        System.out.println("Danik ="+ danik.getAge());

        boolean result = danik.checkAge(19);
        System.out.println("result = " + result);


        danik.setAge(36);
        System.out.println("Danik = "+danik.age);

        System.out.println("Daulet = "+ daulet.age);
        daulet.setAge(35);
        System.out.println("Daulet = " + daulet.age);

    }

}
