package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3006 {
    public static double solve(int n) {
        if (n == 1) {
            return Math.sqrt(n);
        } else {
            return Math.sqrt(n + solve(n - 1));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3006.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.printf("%.11g\n", solve(n));
        }
    }
}
