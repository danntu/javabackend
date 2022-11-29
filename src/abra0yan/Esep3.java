package abra0yan;

import java.util.Scanner;

public class Esep3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("A sanin engiziniz->");
        int a = scanner.nextInt();

        if(a>0){
            System.out.println("A mani = "+a+" on san");
        } else {
            System.out.println("A mani = "+a+" teris san");
        }

    }
}
