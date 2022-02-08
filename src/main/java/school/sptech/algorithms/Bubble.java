package school.sptech.algorithms;

import java.util.Arrays;

public class Bubble extends Algorithm {

    public Integer[] sortList(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    Integer temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    @Override
    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Bubble.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Bubble algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }

    public static void displaySorted(Integer[] list) {
        new Bubble().displaySortedList(list);
    }

    public static Integer[] sort(Integer[] list) {
        return new Selection().sortList(list);
    }
}
