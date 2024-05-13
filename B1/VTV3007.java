package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3007 {
    public static int num;

    public static double solve(int n) {
        if (n == num) {
            return Math.sqrt(n);
        }
        return Math.sqrt(n + solve(++n));
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3007.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            num = scanner.nextInt();
            System.out.printf("%.10f\n", solve(1));
        }
    }
}
