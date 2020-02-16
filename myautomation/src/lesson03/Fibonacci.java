package lesson03;

/**
 * with array
 */
public class Fibonacci {
    public void printFibonacciNumbers(int k) {

        if (k < 1) {
            System.out.println("Please enter a positive number more than 0");
        } else {
            int[] arr = new int[k];
            int n = 1;
            arr[0] = 0;
            if (k == 1) {
                System.out.println(arr[0]);
            } else {
                arr[1] = 1;
                int i = 0;
                while (n <= k) {
                    if (i > 1) {
                        arr[i] = arr[i - 1] + arr[i - 2];
                        System.out.print(arr[i] + " ");
                    } else {
                        System.out.print(arr[i] + " ");
                    }
                    i++;
                    n++;
                }
            }
        }
    }
}
