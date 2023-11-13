import java.util.Scanner;

public class ThreeDivisors {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countNumbersWithThreeDivisors(int N) {
        int count = 0;
        for (int i = 2; i * i <= N; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = countNumbersWithThreeDivisors(N);
        System.out.printf( "%d", count);
    }
}


