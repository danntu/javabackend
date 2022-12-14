package sabak3;

public class Car {

    int goodYear;

    public int getGoodYear() {
        return goodYear;
    }

    public void setGoodYear(int goodYear) {
        this.goodYear = goodYear;
    }

    static int countOfDoor = 5;

//    public int increment(){
//        return countOfDoor + 1;
//    }
   public void getStatic(){
       getCountOfDoor();

   }
    public static int getCountOfDoor() {
        return getCountOfDoor();
    }

    public static void main(String[] args) {
           Car.getCountOfDoor();
        System.out.println(Car.countOfDoor);
        Car camry =  new Car();
        camry.setGoodYear(2007);
//        System.out.println(camry.increment());
//        System.out.println(getCountOfDoor());
//
//        Car man  = new Car();
//        System.out.println(man.increment());
//        System.out.println(getCountOfDoor());



    }

}
