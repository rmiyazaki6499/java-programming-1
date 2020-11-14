
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int characterCount = 0;
        int sum = 0;
        int count = 0;
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")) {
                break;
            }
            
            String[] inputSplit = input.split(",");
            
            count += 1;
            sum += Integer.valueOf(inputSplit[1]);
            
            String[] nameSplit = inputSplit[0].split("");
            if(nameSplit.length > characterCount) {
                characterCount = nameSplit.length;
                longestName = inputSplit[0];
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
    }
}
