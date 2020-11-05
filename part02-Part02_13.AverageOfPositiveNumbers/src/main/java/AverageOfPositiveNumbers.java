
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sumOfPositive = 0;
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                sumOfPositive = sumOfPositive + number;
                count = count + 1;
            }
            if (number == 0) {
                
                break;
            }
        }
        if (count != 0) {
            System.out.println(1.0 * sumOfPositive / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
        

    }
}
