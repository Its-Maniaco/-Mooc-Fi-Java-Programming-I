import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes = new ArrayList<>();

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void Start() {
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        readFile(fileName);
        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println(listRecpies());
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String serchedWord = scanner.nextLine();
                System.out.println("Recipes:");
                System.out.println(recipeByName(serchedWord));
            }

            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int cookTime = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                System.out.println(recipeByTime(cookTime));
            }

            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                System.out.println("Recipes:");
                System.out.println(recipeByIngredient(ingredient));
            }
        }
    }

    private void readFile(String fileName) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.equals("")) {
                    continue;
                }

                // parse name
                String name = row;

                // parse time
                int time = Integer.valueOf(scanner.nextLine());

                // parse ingredients
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                // TODO: replace with a paramatrized constructor of Recipe
                Recipe recipe = new Recipe();
                recipe.setName(name);
                recipe.setTime(time);
                recipe.setIngredient(ingredients);
                // add to recipes
                this.recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private String listRecpies() {
        String output = "";
        for (int i = 0; i < this.recipes.size(); i++) {
            output = output + this.recipes.get(i).getName() + ", cooking time: " + this.recipes.get(i).getTime() + "\n";
        }
        return output;
    }

    private String recipeByName(String word) {
        String output = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(word)) {
                output = output + recipe.getName() + ", cooking time: " + recipe.getTime() + "\n";
            }
        }
        return output;
    }

    private String recipeByTime(int time) {
        String output = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.getTime() <= time) {
                output = output + recipe.getName() + ", cooking time: " + recipe.getTime() + "\n";
            }
        }
        return output;
    }

    private String recipeByIngredient(String word) {
        String output = "";
        for (Recipe recipe : this.recipes) {
            if (recipe.hasIngredient(word)) {
                output = output + recipe.getName() + ", cooking time: " + recipe.getTime() + ".\n";
            }
        }
        return output;
    }

}
