package school.sptech.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge extends Algorithm {
    public Integer[] sortList(Integer[] list) {
        // System.out.println(Arrays.toString(list));
        // System.out.println(Arrays.asList(list));
        return mergeSort(Arrays.asList(list)).toArray(new Integer[list.length]);

    }

    public List<Integer> sortList(List<Integer> list) {

        return mergeSort(list);

    }

    @Override
    public void displaySortedList(Integer[] list) {
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Merge.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Merge algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }

    public static void displaySorted(Integer[] list) {
        new Merge().displaySortedList(list);
    }

    public static Integer[] sort(Integer[] list) {
        return new Merge().sortList(list);
    }

    public static List<Integer> sort(List<Integer> list) {
        return new Merge().sortList(list);
    }

    private static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        Integer mid = (list.size() / 2);

        List<Integer> listA = new ArrayList<Integer>(list.subList(0, mid));
        List<Integer> listB = new ArrayList<Integer>(list.subList(mid, list.size()));
        // System.out.println(mid);
        // System.out.println(list);
        // System.out.println(listA);
        // System.out.println(listB);
        listA = mergeSort(listA);
        listB = mergeSort(listB);

        return merge(listA, listB);
    }

    private static List<Integer> merge(List<Integer> listA, List<Integer> listB) {
        List<Integer> result = new ArrayList<Integer>();
        while (listA.size() > 0 && listB.size() > 0) {
            if (listA.get(0) > listB.get(0)) {
                result.add(listB.get(0));
                listB.remove(0);
            } else {
                result.add(listA.get(0));
                listA.remove(0);
            }
        }
        while (!listA.isEmpty()) {
            result.add(listA.get(0));
            listA.remove(0);
        }
        while (!listB.isEmpty()) {
            result.add(listB.get(0));
            listB.remove(0);
        }

        return result;
    }
}
