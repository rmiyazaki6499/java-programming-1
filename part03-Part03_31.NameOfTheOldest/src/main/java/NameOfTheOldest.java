
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldestAge = 0;
        String oldest = "";
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            String[] inputSplit = input.split(",");
            if(Integer.valueOf(inputSplit[1]) > oldestAge) {
                oldest = inputSplit[0];
                oldestAge = Integer.valueOf(inputSplit[1]);
            }
        }
        System.out.println("Name of the oldest: " + oldest);
    }
}
