import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BigDecimal dollar = new BigDecimal("0");
            BigDecimal euro = new BigDecimal("0");

            System.out.println("Введите сумму в долларах:");

            try {
                dollar = scanner.nextBigDecimal();

                if (dollar.doubleValue() < 0) {
                    System.out.println("Сумма не может быть отрицательной!");
                    throw new RuntimeException();
                }

                euro = dollar.multiply(BigDecimal.valueOf(0.97));

                System.out.println("Сумма в евро: " + euro);
            } catch (Exception e) {
                System.out.println("Недопустимое значение!");
            }
    }
}