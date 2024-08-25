import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int currentWeight() {
        int currentWeight = 0;
        for (Suitcase s : suitcases) {
            currentWeight += s.totalWeight();
        }
        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }

}