
public class Selection {
    public static Integer[] sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            Integer min = i;

            for (int j = i + 1; j < list.length - 1; j++) {
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
}
