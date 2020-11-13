
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        
        int minimum = 9999;
        int index = 0;
        for(int i = 0; i < list.size(); ++i) {
            if (list.get(i) < minimum) {
                minimum = list.get(i);
                index = i;
            }
        }
        System.out.println("Smallest number: " + minimum);
        System.out.println("Found at index: " + index);

    }
}
