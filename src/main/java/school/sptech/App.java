package school.sptech;

import java.util.Arrays;

import school.sptech.algorithms.*;

public class App {
    public static void main(String[] args) {
        Integer[] list = { 4, 2, 8, 7, 5, 5, 2, 8, 3, 7, 23, 9, 2, 5, 8, 5, 3, 8, 3, 3, 8, 3, 8 };
        displayAll(list);
    }

    public static void displayAll(Integer[] list) {
        for (int i = 0; i < 5; i++) {
            // loop needed as the list, in this case the array, is being changed due to
            // object memory reference issues
            Integer[] array = Arrays.copyOfRange(list, 0, list.length);
            switch (i) {
                case 0:
                    Insertion.displaySorted(array);
                    break;
                case 1:
                    Selection.displaySorted(array);
                    break;
                case 2:
                    Bubble.displaySorted(array);
                    break;
                case 3:
                    Merge.displaySorted(array);
                    break;
                case 4:
                    Quicksort.displaySorted(array);
                    break;
                default:
                    break;
            }
        }
    }
}
