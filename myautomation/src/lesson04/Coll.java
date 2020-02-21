package lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Cristina on 21.02.2020.
 */
public class Coll {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bob");
        names.add("Bill");
        names.add("William");
        names.add("Sam");
        names.add("Cris");

        names.remove("Bob");

        System.out.println(names.contains("Bob"));
        System.out.println("");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(names);
        System.out.println("");

        Iterator iterator2 = names.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }
}
