import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> contents = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int currentWeight() {
        int currentWeight = 0;
        for (Item item : contents) {
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }

    public void addItem(Item i) {
        if (this.currentWeight() + i.getWeight() <= this.maxWeight) {
            this.contents.add(i);
        }
    }

    public String toString() {
        if (this.contents.isEmpty()) {
            return "no items (" + this.currentWeight() + " kg)";
        }
        if (this.contents.size() == 1) {
            return this.contents.size() + " item (" + this.currentWeight() + " kg)";
        } else
            ;
        return this.contents.size() + " items (" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        for (Item i : contents) {
            System.out.println(i);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item i : contents) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        }

        Item heaviest = this.contents.get(0);
        for (Item i : contents) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }

}