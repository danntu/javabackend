package sabak2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kansha tovar satti->");
        int sales = scanner.nextInt();
        int rate = 1000;
        int bonus = 250;

        if (sales > 10){
            System.out.println("sizde bonuspen bir " + (rate+bonus));
        } else {
            System.out.println("sizde bonus zhok " + rate);
        }
    }
}
