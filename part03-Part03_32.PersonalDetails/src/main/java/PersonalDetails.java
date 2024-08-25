
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int inputs = 0;
        String namer = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }

            String pieces[] = input.split(",");

            // calc sum of birth, av later
            inputs++;
            sum += Integer.valueOf(pieces[1]);

            // get longest name
            if (namer.length() < pieces[0].length()) {
                namer = pieces[0];
            }
        }
        System.out.println("Longest name: " + namer);
        System.out.println("Average of the birth years: " + (sum / inputs));
    }
}
