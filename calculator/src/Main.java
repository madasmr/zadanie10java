import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double answer = 0;
        boolean continueCalculation = true;

        while(continueCalculation == true){
            System.out.println("Добро пожаловать в консольный калькулятор!");
            try {
                System.out.printf("Введите первое число: ");
                num1 = scanner.nextDouble();

                System.out.printf("Введите второе число: ");
                num2 = scanner.nextDouble();

                System.out.printf("Введите знак операции (+, -, *, /): ");
                String operation = scanner.next();

                switch (operation) {
                    case "+":
                        answer = summation(num1, num2);
                        break;
                    case "-":
                        answer = subtraction(num1, num2);
                        break;
                    case "*":
                        answer = multiplication(num1, num2);
                        break;
                    case "/":
                        if (num2 == 0){
                            System.out.println("На ноль делить нельзя >:(");
                            continueCalculation = false;
                            continue;
                        } else {
                            answer = division(num1, num2);
                        }
                        break;
                    default:
                        System.out.println("Что-то пошло не так!");
                }
                System.out.println(num1 + " " + operation + " " + num2 + " " + "=" + " " + answer);

                System.out.println("Хотите продолжить? (да/нет): ");
                String responce = scanner.next();

                if (!responce.equalsIgnoreCase("да")) {
                    continueCalculation = false;
                }

            } catch (Exception e){
                System.out.println("Что-то пошло не так!");
                continueCalculation = false;
            }
        }
    }

    private static double division(double num1, double num2) {
        return num1 / num2;
    }

    private static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    private static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    private static double summation(double num1, double num2) {
        return num1 + num2;
    }
}