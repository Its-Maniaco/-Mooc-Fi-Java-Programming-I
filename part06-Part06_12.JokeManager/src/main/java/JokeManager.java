import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {

    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int randomJokeIndex = rand.nextInt(this.jokes.size());
        return this.jokes.get(randomJokeIndex);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}