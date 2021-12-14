public class Insertion {
    public static Integer[] sort(Integer[] list) {
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
}
