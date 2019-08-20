import java.util.Scanner;

public class Solution {

    // Complete the powerSum function below.
    static int powerSum(int X, int N) {
        return calc(X, N, 1);
    }
    static int calc(int x, int n, int num) {
        int numToN = (int) Math.pow(num, n);
        if (numToN > x) {
            return 0;
        } else if (numToN == x) {
            return 1;
        } else {
            return (calc(x, n, num+1) + calc(x-numToN, n, num+1));
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);
        
        System.out.println(result);

        scanner.close();
    }
}