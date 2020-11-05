
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int product = 1;

        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= number; ++i) {
            product = product * i;
        }
        System.out.println("Factorial: " + product);

    }
}
