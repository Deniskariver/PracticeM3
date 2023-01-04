

public class task3 {
    public static int sumOddDigits(int n) {
        int sum = 0;
        for (; n != 0; n /= 10) {
            int digit = n % 10;
            if (digit % 2 != 0)
                sum = sum + digit;

        }
        return sum;
    }
}