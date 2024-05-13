package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3009 {
    public static double[] arr = new double[100001];
    public static int count = 0;

    public static void solve(double[] arr, int n) {
        if (n == 0) {
            if (arr[n] > 0) count++;
            return;
        }
        if (arr[n] > 0) {
            count++;
        }
        solve(arr, n - 1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3009.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        solve(arr, n);
        System.out.println(count);
    }
}
