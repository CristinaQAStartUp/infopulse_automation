package lesson0302;

/**
 * Methods with strings
 */
public class Str {
    public static void main(String[] args) {
        String s1 = "This is my first test string";
        String s2 = "097-111-22-33";

        String s3 = "THIS IS MY FIRST TEST STRING";
        String s4 = "                                    This is A string   ";

        System.out.println(s1.charAt(6));
        System.out.println(s1.concat("PREFIX"));
        System.out.println(s1.endsWith("string"));
        System.out.println(s1.endsWith("String"));

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1.indexOf('i'));
        System.out.println(s1.indexOf("st"));
        System.out.println(s1.lastIndexOf('i'));
        System.out.println(s1.lastIndexOf("st"));

        System.out.println(s1.length());
        System.out.println(s1.replace('i', '@'));


        String[] parts = s2.split("-");
        System.out.println(parts[2]);

        System.out.println(s1.startsWith("These"));

        System.out.println(s1.substring(5));
        System.out.println(s1.substring(5, 12));

        char[] arr = s1.toCharArray();
        System.out.println("arr[1] = " + arr[1]);

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());


        System.out.println(s4);
        System.out.println(s4.trim());


    }
}
