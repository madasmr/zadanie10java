import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double radius, area;

            System.out.println("Введите радиус круга:");

            try {
                radius = scanner.nextDouble();

                if (radius <= 0) {
                    System.out.println("Радиус не может быть меньше или равен нулю!");
                    throw new RuntimeException();
                }

                area = 2 * Math.PI * radius;

                System.out.println("Площадь круга равна: " + area);
            } catch (Exception e) {
                System.out.println("Недопустимое значение!");
            }
    }
}