import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[10];
            int maximum;

            System.out.printf("{ ");
            for (int i : array){
                array[i] = random.nextInt();
                System.out.printf(array[i] + " ");
            }
            System.out.println("}");

            maximum = Arrays.stream(array).max().getAsInt();

            System.out.println("Максимальное значение: " + maximum);
    }
}
