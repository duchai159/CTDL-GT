package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3001 {
    public static int solve(int n) {
        if (n == 0) {
            System.out.println("0! = 1");
            return 1;
        }
        int result = n * solve(n-1);
        System.out.println(n + "! = " + result);
        return result;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3001.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n);
    }
}
