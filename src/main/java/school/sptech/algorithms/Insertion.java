package school.sptech.algorithms;

import java.util.Arrays;

public class Insertion extends Algorithm {
    public Integer[] sortList(Integer[] list) {
        for (int i = 1; i < list.length; i++) {
            Integer value = list[i];
            int j = i - 1;
            // while (j >= 0 && list[j] > value) {
            // list[j + 1] = list[j];
            // j--;
            // }
            for (; j >= 0; j--) {
                if (list[j] > value) {
                    list[j + 1] = list[j];
                    continue;
                }
                break;
            }
            list[j + 1] = value;
        }
        return list;
    }

    public static Integer[] sort(Integer[] list) {
        return new Selection().sortList(list);
    }

    @Override
    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Insertion.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Insertion algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }

    public static void displaySorted(Integer[] list) {
        new Insertion().displaySortedList(list);
    }

}
