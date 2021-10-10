package pl.sda.mg.zadanie1;

import java.util.Comparator;

public class StringOrderComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1 == null) {
            return -1;
        }

        if (s2 == null) {
            return 1;
        }

        if (s1.equals(s2)) {
            return 0;
        }

//        for
//        "abc";
//        "adc";


        return -s1.compareToIgnoreCase(s2);
    }


    public void stupidMethod() {
        System.out.println("Yo!");
    }
}
