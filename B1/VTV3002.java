package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3002 {
    public static int count = 0;
    public static long solve(long n) {
        if (n / 10 == 0) {
            return n % 10;
        }
        long emp = n % 10;
        if (emp > solve(n / 10)) {
            return emp;
        }
        if (emp == 9) {
            return emp;
        }
        return solve(n / 10);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3002.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.printf("%10d: %d\n", n, solve(n));
        }
    }
}
