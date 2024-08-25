
public class Container {

    private int capacity;
    private int currentAmount;

    public Container() {
        this.capacity = 100;
        this.currentAmount = 0;
    }

    public void add(int amount) {
        if (this.currentAmount + amount > this.capacity) {
            this.currentAmount = this.capacity;
        }

        else if (amount > 0) {
            this.currentAmount += amount;
        }
    }

    public void remove(int amount) {
        if (this.currentAmount - amount < 0) {
            this.currentAmount = 0;
        }

        else if (amount > 0) {
            this.currentAmount -= amount;
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int contains() {
        return this.currentAmount;
    }

    public String toString() {
        return this.currentAmount + "/" + this.capacity;
    }

}