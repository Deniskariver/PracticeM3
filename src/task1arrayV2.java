public class task1arrayV2 {



    public static void main(String[] args) {
            int[] array = new int[]{100, 2, 3, 4, 5, 6, 10, 8, 4, 8};
            for (int i = 0, j=array.length-1; i < array.length / 2; i++,j--) {
                if (array[i] % 2 == 0 && array[j] % 2 == 0) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }

            }

        }
    }




