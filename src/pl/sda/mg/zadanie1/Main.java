package pl.sda.mg.zadanie1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> input = Arrays.asList(
                "aa", "Ab", "abc", "z", "asd", "Za", "ads", "mn");

        System.out.println("Przed sortowaniem: " + input);
        List<String> output = sortStringsIgnoreCase(input);
        System.out.println("Po sortowaniu: " + output);
    }

    private static List<String> sortStrings(List<String> listToSort) {
        List<String> input = new ArrayList<>(listToSort);
        Comparator<String> myCoparator = Comparator.reverseOrder();
        input.sort(myCoparator);
//        input.sort(Comparator.reverseOrder());
        return input;
    }

    private static List<String> sortStringsIgnoreCase(List<String> listToSort) {
        List<String> input = new ArrayList<>(listToSort);
        Comparator<String> myComparator = new StringOrderComparator();
//        myComparator.stupidMethod();
        input.sort(myComparator);
//        input.sort(new StringOrderComparator());
        return input;
    }
}
