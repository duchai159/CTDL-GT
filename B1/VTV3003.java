package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3003 {
    public static int count;

    public static void init() {
        count = 0;
    }

    public static long solve(long n) {
        if (n / 10 == 0) {
            count++;
            return n % 10;
        }
        long emp = n % 10;
        long num = solve(n / 10);
        if (emp > num) {
            count = 1;
            return emp;
        }
        if (emp == num) {
            count++;
            return emp;
        }
        return num;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3003.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            init();
            solve(n);
            System.out.printf("%10d: %d\n", n, count);
        }
    }
}
