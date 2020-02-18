package lesson02;

/**
 * Created by Христя on 18.02.2020.
 */
public class Mystring3 {

    public String eachNth3(String a, int n) {
        if (n < 1) {
            String err1 = "The number isn't correct! It should be >= 1!";
            System.out.println(err1);
            return err1;
        } else if (a.length() < 1) {
            String err2 = "Your string is empty! Please enter the correct string!";
            System.out.println(err2);
            return err2;
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
            String st = res2.toString();
            return st;
        }
    }
}
