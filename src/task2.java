import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your N from 100 to 999");
        int i = scanner.nextInt();
        int reversed = 0;

        if (!scanner.hasNextInt())
        {
            System.out.println("Wrong input");
            scanner.close();
            return;
        }
        if (i <= 999 && i >= 100)
        {
            for (; i != 0; i /= 10) {
                int digit = i % 10;
                reversed = reversed * 10 + digit;
            }
            System.out.println("Reversed N: " + reversed);
        }else
                System.out.println("error");
                scanner.close();
    }
}
