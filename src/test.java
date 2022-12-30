import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your N");

        if (!input.hasNextInt()) {
            System.out.println("Wrong input");
            input.close();
            return;
        }

        int num = input.nextInt();
        int sum = 1;
        if (num == 0)
            sum = 0;
        else {

            int[] a = new int[num];
            a[0] = 0;
            a[1] = 1;

            for (int i = 2; i < num; i++) {
                a[i] = a[i - 1] + a[i - 2];
                sum += a[i];
            }
        }
        System.out.println(sum);
        input.close();
    }
}
