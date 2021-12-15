package algorithms;

import java.util.Arrays;

public class Algorithm {
    public Integer[] sortList(Integer[] list) {
        return list;
    };

    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(new Algorithm().sortList(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The %s algorithm returned: %s \nand took %g milliseconds to complete execution\n",
                Thread.currentThread().getStackTrace()[1].getClassName(), sortedList,
                (end - start) / 1_000_000d));
    }
}
