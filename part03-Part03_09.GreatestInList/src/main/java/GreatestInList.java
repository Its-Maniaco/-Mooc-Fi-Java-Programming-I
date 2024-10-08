
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int greatest = -99999999;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            if (input>greatest) {
                greatest = input;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        System.out.println("The greatest number: " + greatest);
    }
}
