import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Введите свой возраст:");
        try{
            age = scanner.nextInt();

            if (age < 0){
                System.out.println("Возраст не может быть отрицательным!");
            }
            else if (age < 18){
                System.out.println("Вы несовершеннолетний");
            }
            else{
                System.out.println("Вы совершеннолетний");
            }
        } catch (Exception e){
            System.out.println("Недопустимое значение!");
        }

    }
}