package sabak2;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zhasiniz neshede->");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Adam zhasi teris san bolmaidi");
        } else {

            if (age > 18 && age < 25) {
                System.out.println("Sizdin zhasiniz zhastar");
            } else if (age > 25) {
                System.out.println("Sizdin zhasiniz ulken");
            } else {
                System.out.println("Sizdin zhasiniz kishi");
            }
        }




    }
}
