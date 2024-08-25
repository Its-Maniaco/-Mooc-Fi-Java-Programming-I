import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            String publication = scanner.nextLine();

            // add book
            books.add(new Book(title, pages, publication));
        }

        System.out.println("What information will be printed?");
        String infoPrint = scanner.nextLine();

        if (infoPrint.equals("everything")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle() + ", " + books.get(i).getPages() + " pages, "
                        + books.get(i).getPublication());
            }
        }
        if (infoPrint.equals("name")) {
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle());
            }
        }
    }
}
