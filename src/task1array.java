
public class task1array {
    public static void main(String[] args) {
        int[] array = new int[]{100, 2, 3, 4, 5, 6, 10, 8, 4, 8};
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[array.length - i - 1] % 2 == 0) {
                int a = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = a;
            }

        }

    }
}


