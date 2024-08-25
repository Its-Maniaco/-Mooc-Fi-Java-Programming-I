
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int number = Integer.valueOf(scan.nextLine());

        if (number < 0) {
            System.out.println("impossible!");
        } else if (number >= 0 && number <=49) {
            System.out.println("failed");
        } else if (number >= 50 && number <=59) {
            System.out.println("1");
        } else if (number >= 60 && number <=69) {
            System.out.println("2");        
        } else if (number >= 70 && number <=79) {
            System.out.println("3");
        } else if (number >= 80 && number <=89) {
            System.out.println("4");
        } else if (number >= 90 && number <=100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }
}
