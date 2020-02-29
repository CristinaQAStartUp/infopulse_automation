package lesson02;

/**
 * Created by Cristy on 18.02.2020.
 */
public class Mystring4 {

    public String eachNth3(String a, int n) {
        int l = a.length();

        if (n < 1) {
            String err1 = "The number isn't correct! It should be >= 1!";
            return err1;
        } else if (l < 1) {
            String err2 = "Your string is empty! Please enter the correct string!";
            return err2;
        } else {
            System.out.println("The result string is: ");
            String res = "";
            for (int i = 0; i < l; i = i + n) {
                res = res + a.charAt(i);
            }
            return res;
        }
    }
}
