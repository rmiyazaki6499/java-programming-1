
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((firstNumber + secondNumber) / 2));

    }
}