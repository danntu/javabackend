package sabak2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A manin engiz ->");
        int a =  scanner.nextInt();

        System.out.print("B manin engiz ->");
        int b = scanner.nextInt();

        int songiMan = a/b;

        System.out.println("A boindagi B " + songiMan);

        scanner.close();


    }
}
