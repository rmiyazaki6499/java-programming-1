
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int largest = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input > largest) {
                largest = input;
            }
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        
        System.out.println("The greatest number: " + largest);
        
    }
}
