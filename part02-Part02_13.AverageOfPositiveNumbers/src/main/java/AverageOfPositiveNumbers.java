
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputs = 0;
        int sum=0;
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input==0) {
                break;
            }

            if (input<0) {
                continue;
            }

            inputs = inputs + 1;
            sum = sum + input;
        }

        if (inputs==0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(((double)(sum)/inputs));
        }
    }
}
