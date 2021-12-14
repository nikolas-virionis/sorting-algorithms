import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Integer[] list = { 4, 2, 8, 7, 5, 5, 2, 8, 3, 7, 23, 9, 2, 5, 8, 5, 3, 8, 3, 3, 8, 3, 8 };
        long start = System.nanoTime();
        String sortedList = Arrays.toString(Insertion.sort(list));
        long end = System.nanoTime();
        System.out.println(String.format(
                "The Insertion algorithm returned: %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
        start = System.nanoTime();
        sortedList = Arrays.toString(Selection.sort(list));
        end = System.nanoTime();
        System.out.println(String.format(
                "The Selection algorithm returned %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
        start = System.nanoTime();
        sortedList = Arrays.toString(Bubble.sort(list));
        end = System.nanoTime();
        System.out.println(String.format(
                "The Bubble algorithm returned %s \nand took %g milliseconds to complete execution\n", sortedList,
                (end - start) / 1_000_000d));
    }
}
