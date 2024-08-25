
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    // checks is the arraylist is empty
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    // adds the passed string on to the arraylist
    public void add(String value) {
        this.list.add(value);
    }

    // returns a new arraylist with all the added values
    public ArrayList<String> values() {
        return this.list;
    }

    public String take() {
        String last = this.list.get(this.list.size() - 1);
        this.list.remove(last);
        return last;
    }

}