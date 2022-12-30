import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your N");
        if (!input.hasNextInt()) {
            System.out.println("Wrong input");
            input.close();
            return;
        }
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum + fibo(i);
        }
        System.out.println(sum);
    }

    public static int fibo(int n) {
        int res;
        if (n == 0)
            res = 0;

        else if (n == 1)
            res = 1;
        else
            res = fibo(n - 1) + fibo(n - 2);
        return res;
    }
}