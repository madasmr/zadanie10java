public class Main {
    public static void main(String[] args) {
            String bigString = "  очень  длинн ая стр ока с проб ел ами   ";
            System.out.println(bigString);

            bigString = bigString.replace(" ", "");
            System.out.println(bigString);
    }
}
