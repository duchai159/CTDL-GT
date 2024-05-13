package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3013 {
    public static double solve(double n) {
        if (n == 1) {
            return n / (n + 1);
        }
        return n / (n + 1) + solve(n - 1);
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3013.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            double n = scanner.nextDouble();
            System.out.printf("%.10f\n", solve(n));
        }
    }
}
