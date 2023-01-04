public class task2array {
    public static void main(String[] args) {
        int[] array = {1, 20, 20, 4, -1, -10, 20, 0, 20};
        int max = array[0];
        int count1=0, count2=0;
        for (int m :
                array) {
            if (m > max)
                max = m;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                count1=i;
                break;
            }
        }
        for (int j= array.length - 1; j >= 0 ; j--) {
            if (array[j] == max) {
                count2 = j;
                break;
            }
        }
        System.out.println(count2-count1);
    }
}