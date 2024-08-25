
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {

            System.out.println("First: " + firstContainer.contains() + "/" + firstContainer.getCapacity());
            System.out.println("Second: " + secondContainer.contains() + "/" + secondContainer.getCapacity());

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
            }

            if (command.equals("move")) {

                if (amount > firstContainer.contains()) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(amount);
                } else {
                    secondContainer.add(amount);
                    firstContainer.remove(amount);
                }
            }

            if (command.equals("remove")) {
                secondContainer.remove(amount);
            }

        }
    }

}