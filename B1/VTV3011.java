package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3011 {
    public static int funX(int n) {
        if (n == 0) return 1;
        return funX(n - 1) + funY(n - 1);
    }

    public static int funY(int n) {
        if (n == 0) return 0;
        return 3 * funX(n - 1) + funY(n - 1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3011.txt"));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            System.out.println(funX(n) + " " + funY(n));
        }
    }
}
