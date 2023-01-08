package sabak8;

import java.io.BufferedReader;

public class AnimalAbs implements Animal{

    int a;
    static int f;


    @Override
    public void move() {

    }

    @Override
    public void jump() {
        this.move();

    }

    @Override
    public void fly() {

    }

    public static void main(String[] args) {


        AnimalAbs animalAbs1 = new AnimalAbs();
        System.out.println(animalAbs1);

        AnimalAbs animalAbs2 = new AnimalAbs();
        System.out.println(animalAbs2);


    }
}
