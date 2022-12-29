package metanit;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
//        boolean isActive = false;
//        boolean isAlive = true;
//
//        byte a = (byte)128;
//        byte b = 8;
//        System.out.println(a);
//
//        char charExample=97-32;
//        System.out.println(charExample);
//
//        String test = "Hello  Test";
//        System.out.println(test);
//
//
//        String text = """
//                Вот мысль, которой весь я предан,
//                Итог всего, что ум скопил.
//                Лишь тот, кем бой за жизнь изведан,
//                Жизнь и свободу заслужил.
//                """;
//        System.out.println(text);
//
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = in.nextLine();
//        System.out.print("Input age: ");
//        int age = in.nextInt();
//        System.out.print("Input height: ");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();
//
//        for (int i = 0; i < 10; i++){
//            if (i == 5)
//                continue;
//            System.out.println(i);
//        }

        int[] nums = new int[4];
// устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        for (int a:
             nums) {
            System.out.println(a);
        }


            Variable variable = new Variable();

        hello();
        welcome();

        int result = variable.sum(3,4);
        System.out.println(result);

        System.out.println(variable.sum(3,4));


    }


    static void sum(String message, int ...nums){

        System.out.println(message);
        int result =0;
        for(int x:nums)
            result+=x;
        System.out.println(result);
    }

     int sum(int x, double y){

        return  (int)(x + y);

    }

    static void hello(){

        System.out.println("Hello");
    }
    static void welcome(){

        System.out.println("Welcome to Java 10");
    }

}
