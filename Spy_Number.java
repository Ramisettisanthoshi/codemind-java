import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isSpyNumber(number)) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not Spy Number");
        }
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int digit;

        while (number > 0) {
            digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product;
    }
}


