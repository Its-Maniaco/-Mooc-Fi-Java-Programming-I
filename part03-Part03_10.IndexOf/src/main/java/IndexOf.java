
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        System.out.println("Search for?");
        int key = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> positions = new ArrayList<>();
        // implement here finding the indices of a number
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == key) {
                positions.add(i);
            }
        }
        if (positions.size() > 0) {
            for (int i = 0; i < positions.size(); i++) {
                System.out.println(key + " is at " + positions.get(i));
            }
        }
    }
}
