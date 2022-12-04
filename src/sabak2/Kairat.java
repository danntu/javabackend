package sabak2;

public class Kairat {

    public static void main(String[] args) {

//        int[] kairat1  =  new int[11];
        int[] kairat1  =  {500, 7000, -5000, 0, 340};
//        int kairat2[] = new int[11];
        int kairat2[] = new int[]{5, 7, 9, -5, 6};

        int sum = 0;

        for (int i = 0; i< kairat1.length; i++){
            sum = sum + kairat1[i];
            //System.out.println("sum siklda " + sum);
        }

        System.out.println("Tolik summa " + sum);
        System.out.println("ortak summa " + (sum/kairat1.length));






        System.out.println(kairat2[0]);


        // eki olshemdi massiv
        int[][] matrix = { {1}, {2, 3}, {4, 5, 6}, {7, 42, 9, 8} };
        System.out.println("matrix[3][1] = "+matrix[3][1]);

        for (int i = 0; i< 4; i++){
            for (int j =0; j<i;j++){
                System.out.println("matrix["+i+"]["+j+"] = "+ matrix[i][j]);
            }
        }

    }


}
