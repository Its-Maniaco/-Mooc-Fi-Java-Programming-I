
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username then password");
        String uname = scanner.nextLine();
        String password = scanner.nextLine();
        if ((uname.equals("alex") && password.equals("sunshine")) ||
                (uname.equals("emma") && password.equals("haskell"))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
