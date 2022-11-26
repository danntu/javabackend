import java.util.Scanner;

public class Sabak1 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" height manin engiz");
        int height = scanner.nextInt();

        System.out.println(" width manin engiz");
        int width = scanner.nextInt();

        System.out.println("height manin " + height);
        System.out.println("width manin " + width);


        int rectangleArea = height*width;

        System.out.println(rectangleArea);



    }


}
