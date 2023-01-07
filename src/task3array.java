import java.util.Arrays;

public class task3array {
    public static void main(String[] args) {

        int[][] array = {{2, 4, 3, 3}, {5, 7, 8, 5}, {2, 4, 3, 3}, {5, 7, 8, 5}};

        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = i + 1; j <= array[i].length - 1; j++) {
                array[i][j] = 1;
            }
        }
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                array[i][j] = 0;
                }
            }
        }
    }



