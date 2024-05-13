package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3010 {
    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double solve(double x, int n) {
        if (n == 1) {
            return x;
        } else {
            return Math.pow(x, n) / factorial(n) + solve(x, n - 1);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3010.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            double x = scanner.nextDouble();
            int n = scanner.nextInt();
            System.out.printf("%.8f\n", solve(x, n));
        }
    }
}
