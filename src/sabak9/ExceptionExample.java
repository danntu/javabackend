package sabak9;

import java.util.Date;
import java.util.Scanner;

public class ExceptionExample {

    static  int a = 16;
    int age;

    public void setA(){
        a++;
    }

    public void setA2(ExceptionExample e){
        System.out.println(e.age);
    }

    public static void main(String[] args) throws FactorialException {

        ExceptionExample exceptionExample = new ExceptionExample();

        System.out.println(ExceptionExample.a);
        exceptionExample.setA();

        ExceptionExample exceptionExample1 =  new ExceptionExample();
        System.out.println(ExceptionExample.a);






//        int result = getFactorial(-6);
////
//            System.out.println(result);
//        try{
//            int result = getFactorial(-6);
//
//            System.out.println(result);
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//        }
    }


    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1", num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }


}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        System.out.println("Custom exception");
        System.out.println(number);
        number=num;
    }
}

