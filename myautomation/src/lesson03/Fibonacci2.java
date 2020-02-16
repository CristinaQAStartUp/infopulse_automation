package lesson03;

/**
 * without array
 */
public class Fibonacci2 {
    public void printFibonacciNumbers(int k) {
        int n0 = 0;
        int n1 = 1;
        int n;
        if (k < 1) {
            System.out.println("Please enter a positive number more than 0");
        } else if (k == 1) {
            System.out.println(n0);
        } else {
            System.out.print(n0 + " " + n1 + " ");
            for (int i = 3; i <= k; i++) {
                n = n0 + n1;
                System.out.print(n + " ");
                n0 = n1;
                n1 = n;
            }
            System.out.println();
        }
    }
}
