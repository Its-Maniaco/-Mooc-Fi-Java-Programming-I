
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        // write some code here
        int compare = -1;
        if (number1 > number2) {
            compare = number1;
        } else {
            compare = number2;
        }

        if (compare > number3) {
            return compare;
        }

        return number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
