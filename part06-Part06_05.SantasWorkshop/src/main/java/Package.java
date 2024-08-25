import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> giftList;

    public Package() {
        this.giftList = new ArrayList();
    }

    public void addGift(Gift gift) {
        giftList.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (Gift gift : giftList) {
            total += gift.getWeight();
        }
        return total;
    }

}