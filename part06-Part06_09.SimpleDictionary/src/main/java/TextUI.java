import java.util.Scanner;

public class TextUI {
    private SimpleDictionary sd;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.sd = sd;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.sd.add(word, translation);
                continue;
            }

            if (input.equals("search")) {
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                String translation = sd.translate(toTranslate);
                if (translation == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
                continue;
            }

            System.out.println("Unknown command");
        }
    }
}
