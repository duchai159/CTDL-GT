package B1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VTV3008 {
    public static int[] arr = new int[10001];

    public static int solve(int[] arr, int n) {
        if(n == 0){
            return arr[n] % 2 == 0 ? arr[n] : 0;
        }
        if(arr[n] % 2 == 0){
            return arr[n] + solve(arr, n - 1);
        }
        return solve(arr, n - 1);
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("B1/VTV3008.txt"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solve(arr, n));
    }
}
