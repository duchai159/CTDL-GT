package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3005 {
    public static void solve(int n) {
        if (n < 2) {
            System.out.printf("%d", n);
        } else {
            solve(n / 2);
            System.out.printf("%d", n % 2);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3005.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            solve(n);
            System.out.println();
        }
    }
}
