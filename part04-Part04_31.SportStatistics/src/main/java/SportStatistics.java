
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fName = scan.nextLine();

        ArrayList<Game> game = new ArrayList<>();

        // file scanner
        try (Scanner file = new Scanner(Paths.get(fName))) {
            // add all games to list
            while (file.hasNextLine()) {
                String row = file.nextLine();
                String[] parts = row.split(",");

                Game gameObj = new Game(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                game.add(gameObj);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ask user for team
        String team = scan.nextLine();
        int gameCount = 0;
        int winCount = 0;
        int lossCount = 0;

        for (Game match : game) {
            if (match.getHomeTeam().equals(team) || match.getAwayTeam().equals(team)) {
                gameCount++;
            } else {
                continue;
            }

            if (match.getWinner().equals(team)) {
                winCount++;
            } else {
                lossCount++;
            }
        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
