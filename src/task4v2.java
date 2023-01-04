public class task4v2 {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
    }
}