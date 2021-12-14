public class Bubble {
    public static Integer[] sort(Integer[] list) {
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
}
