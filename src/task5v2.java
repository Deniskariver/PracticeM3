import java.util.Scanner;

public class task5v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your N");

        if (!input.hasNextInt()) {
            System.out.println("Wrong input");
            input.close();
            return;
        }

        int n = input.nextInt();
        int sum = 1;
        if ( n<0)
            throw new IllegalArgumentException();

        if  (n == 0)
            sum = 0;
        else {

            int[] a = new int[n];
            a[0] = 0;
            a[1] = 1;

            for (int i = 2; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
                sum += a[i];
            }
        }
        System.out.println(sum);
        input.close();
    }
}
