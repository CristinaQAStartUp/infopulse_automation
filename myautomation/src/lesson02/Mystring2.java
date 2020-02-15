package lesson02;

/**
 * Version 2
 */
public class Mystring2 {
    public void eachNth2(String a, int n) {
        if (n < 1) {
            System.out.println("The number isn't correct! It should be >= 1!");
            return;
        } else if (a.length() < 1) {
            System.out.println("Your string is empty! Please enter the correct string!");
            return;
        } else {
            char[] res = a.toCharArray();
            char[] res2 = new char[20];
            int k = 0;
            System.out.println("Result string is:");
            for (
                    int i = 0;
                    i < res.length; i += n)

            {
                res2[k] = res[i];
                k++;
            }
            System.out.println(res2);
        }
    }
}
