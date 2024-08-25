import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int smallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[smallest] > array[i]) {
                smallest = i;
            }
        }
        return smallest;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length == 0 || startIndex >= table.length) {
            return -1;
        }

        int smallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[smallest] > table[i]) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 >= array.length || index2 >= array.length) {
            return;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int smallestInd = indexOfSmallestFrom(array, i);
            swap(array, i, smallestInd);
        }

        System.out.println(Arrays.toString(array));
    }

    
}
