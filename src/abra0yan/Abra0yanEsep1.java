package abra0yan;

import java.util.Scanner;

public class Abra0yanEsep1 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("l manin engiziniz->");
        int l = scanner.nextInt();
        int lm = l /100;

        System.out.println("l=" + l +" cm "+ lm + " metr " + (l%100)+" cm");
    }
}
