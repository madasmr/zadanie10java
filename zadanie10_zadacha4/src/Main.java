import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Random random = new Random();
            int[][] array = new int[5][5];

            System.out.printf("{ ");
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){
                    array[i][j] = random.nextInt();
                    System.out.printf(array[i][j] + " ");
                    }
                System.out.println();
                }
            System.out.printf("}");

            System.out.println();

        System.out.printf("{ ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                Arrays.sort(array[i]);
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.printf("}");

        System.out.println();

        System.out.printf("{ ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (i == j){
                    System.out.printf(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.printf("}");
    }
}