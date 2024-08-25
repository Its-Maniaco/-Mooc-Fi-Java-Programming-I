
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int numberFromUser = Integer.valueOf(scanner.nextLine());

            // For breaking the loop when user writes 0
            if (numberFromUser == 0) {
                break;
            }

            numberOfInputs = numberOfInputs + 1;
            sum = sum + numberFromUser;
        }

        // For printing the number of positive numbers
        System.out.println("Average of the numbers: " + ((double)(sum)/numberOfInputs));

    }
}
