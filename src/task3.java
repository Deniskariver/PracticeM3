import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your N");
        int i;
        if (!scanner.hasNextInt())
        {
            System.out.println("Wrong input");
            scanner.close();
            return;
        }
            i = scanner.nextInt();
        int sum = 0;
        for (; i != 0; i /= 10) {
            int digit = i % 10;
            if (digit % 2 != 0)
                sum = sum + digit;

        }
        System.out.println("Sum N: " + sum);
        scanner.close();
    }
}