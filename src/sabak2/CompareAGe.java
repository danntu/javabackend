package sabak2;

import java.util.Scanner;

public class CompareAGe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sizdin zhasinis neshede->");
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("Sizge kiruge ruksat emes");
        }

        System.out.println("Kelesi matin");

//        else {
//            System.out.println("Sizdin zhasiniz kishi ruksat ");
//        }

    }
}
