package lesson02;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Version 1
 */
public class Mystring {
    public void eachNth(String a, int n) {
        if (n < 1) {
            System.out.println("The number isn't correct! It should be >= 1!");
            return;
        } else if (a.length() < 1) {
            System.out.println("Your string is empty! Please enter the correct string");
            return;
        } else {
            char[] res = a.toCharArray();
            System.out.println("Result string is:");
            for (
                    int i = 0;
                    i < res.length; i += n)

            {
                System.out.print(res[i]);
            }
            String s2 = new String(res);
            System.out.println(s2);
        }
    }
}
