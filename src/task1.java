import java.util.Scanner;

import static java.lang.Math.abs;


public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your N:");
        int i = scanner.nextInt();
        if (i > 0) {
            i = i * i;
            System.out.println(i);
        }
        if (i < 0) {
            i = abs(i);
            System.out.println(i);
        }
        if (i == 0) {
            System.out.println(i);
        }
    }
}
