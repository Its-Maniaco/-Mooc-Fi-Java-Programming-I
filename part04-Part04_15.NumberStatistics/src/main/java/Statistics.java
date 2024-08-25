import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> arr = new ArrayList<>();

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        arr.add(number);
    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        // write code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    public double average() {
        // write code here
        if (getCount() == 0)
            return 0;
        return (double) (sum()) / getCount();
    }
}