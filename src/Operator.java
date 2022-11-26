public class Operator {
    public static void main(String[] args) {
        int a = 6 + 7;
        int b = 1;

        b--;
        System.out.println(b);

        b += 5;
        b = b + 5;

        b /= 5;
        b = 6 % 5;

        b *= 5;
        //b = b * 5;

        float x = 1;
        float y = 3;
        float z = x / y;
        System.out.println(z);

        int b1 = 0b1110; // 14
        int b2 = 0b1001; // 9
        int i = 0;
        System.out.println(!false);

        boolean a1 = false;
        boolean b12 = true;

        System.out.println(5==5 && 5!=6);

        int bonus = (5<7) ? 10 : 0;

        System.out.println(bonus);

        Integer test = bonus;
        System.out.println(test);
    }
}
