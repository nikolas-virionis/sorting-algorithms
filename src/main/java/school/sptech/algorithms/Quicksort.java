package school.sptech.algorithms;

import java.util.Arrays;
import java.util.Random;

public class Quicksort extends Algorithm {
    public Integer[] sortList(Integer[] list) {
        sortList(list, 0, list.length - 1);
        return list;
    }

    private void sortList(Integer[] list, int start, int end) {
        if (start >= end) {
            return;
        }
        Integer pivot = partition(list, start, end);
        sortList(list, start, pivot - 1);
        sortList(list, pivot + 1, end);

    }

    private int partition(Integer[] list, int start, int end) {
        swap(list, start, getPivot(start, end));
        int border = start + 1;
        for (int i = border; i <= end; i++) {
            if (list[i] < list[start]) {
                swap(list, i, border++);
            }
        }
        swap(list, start, border - 1);
        return border - 1;
    }

    private int getPivot(int low, int high) {
        Random rand = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    public void swap(Integer[] list, int index1, int index2) {
        Integer temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;
    }

    public static Integer[] sort(Integer[] list) {
        return new Quicksort().sortList(list);
    }

    @Override
    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Quicksort.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Quicksort algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }

    public static void displaySorted(Integer[] list) {
        new Quicksort().displaySortedList(list);
    }
}
