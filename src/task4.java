import java.util.Scanner;
    public class task4 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Write your N");
            if (!input.hasNextInt())
            {
                System.out.println("Wrong input");
                input.close();
                return;
            }
            int num = input.nextInt();
            int count = 0;
            while (num != 0) {
                num = num & (num - 1);
                count++;
            }
            System.out.println(count);
            input.close();
        }

    }
