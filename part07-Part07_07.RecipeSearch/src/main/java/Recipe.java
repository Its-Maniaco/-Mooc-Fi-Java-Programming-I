import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;


    public Recipe () {
        this.name = "";
        this.time = 0;
        this.ingredients = new ArrayList<>();
    }
    
    // getters 
    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }


    // setters
    public void setName (String name) {
        this.name = name;
    }

    public void setTime (int time) {
        this.time = time;
    }

    public void setIngredient (ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient (String ingredient) {
        this.ingredients.add(ingredient);
    }

    public boolean hasIngredient (String word) {
        for (String ingredient : ingredients) {
            if (ingredient.equals(word)) {
                return true;
            }
        }
        return false;
    } 

}
