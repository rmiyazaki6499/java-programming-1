
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double thirdNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((firstNumber + secondNumber + thirdNumber) / 3));

    }
}
