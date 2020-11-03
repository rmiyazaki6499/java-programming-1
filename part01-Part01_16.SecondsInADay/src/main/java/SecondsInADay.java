
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        final int hoursInADay = 24;
        final int minutesInAnHour = 60;
        final int secondsInAMinute = 60;
        int secondsInADay = days * hoursInADay * minutesInAnHour * secondsInAMinute;
        System.out.println(secondsInADay);
    }
}
