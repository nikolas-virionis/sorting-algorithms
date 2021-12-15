package algorithms;

import java.util.Arrays;

public class Selection extends Algorithm {
    public Integer[] sortList(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            Integer min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            Integer temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
        return list;
    }

    public static Integer[] sort(Integer[] list) {
        return new Selection().sortList(list);
    }

    @Override
    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Selection.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Selection algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }

    public static void displaySorted(Integer[] list) {
        new Selection().displaySortedList(list);
    }
}
