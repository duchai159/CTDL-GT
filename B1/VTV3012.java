package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3012 {
    public static double[] arr = new double[100001];

    public static int solve(double[] arr, int n) {
        if (n == 0) {
            return arr[n] < 0 ? 1 : 0;
        }
        if (arr[n - 1] >= 0) {
            return 0;
        }
        return solve(arr, n - 1);
    }


    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3012.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextDouble();
            }
            if (solve(arr, n) == 1) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
