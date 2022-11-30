package sabak2;

import java.util.Scanner;

public class CompareAGe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Sizdin zhasinis neshede->");
//        int age = scanner.nextInt();
//
//        if (age < 18){
//            System.out.println("Sizge kiruge ruksat emes");
//        }
//
//        System.out.println("Kelesi matin");

//        else {
//            System.out.println("Sizdin zhasiniz kishi ruksat ");
//        }

//        System.out.print("Value engiz ->");
//        int value = scanner.nextInt();
//
//        switch (value) {
//            case 1 : case 2 : case 3: case 4 :
//                System.out.println("1 men 4 arasinda san " + value); break;
//            case 9:
//                System.out.println("9 sani " + value); break;
//            case 0:
//                System.out.println("0 sani " + value); break;
//            default:
//                System.out.println("Eshandai shartka kelmegen san " + value);
//        }
////
//        if (value >= 1 && value <= 4) {
//            System.out.println("1 men 4 arasinda san " + value);
//        } else if (value == 9) {
//            System.out.println("9 sani " + value);
//        } else if (value == 0) {
//            System.out.println("0 sani " + value);
//        } else {
//            System.out.println("Eshandai shartka kelmegen san " + value);
//        }

//        System.out.print("A manin engiz ->");
//        int a = scanner.nextInt();
//
//        if (a%2==0){
//            System.out.println(a + " zhup san");
//        } else {
//            System.out.println(a + " tak san");
//        }

        // do while
        int i = 0;
        int sum = 0;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);

        System.out.println("summa do while() " + sum);


        //while
        i = 0;
        sum = 0;
        while (i <= 10) {
            sum += i;  // sum = sum + i;
            i++;
        }
        System.out.println("summa while() " + sum);

        // for
        sum = 0;
        for (i = 0; i<=10; i++) {
            sum += i;
        }
        System.out.println("summa while() " + sum);



        // while(true)

    }
}
