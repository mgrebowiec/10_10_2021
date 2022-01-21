package pl.sda.mg.prezentacja.zad29;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaa", "aba", "bbb", "a", "b", "ca");
        double result = StatisticsUtil.partOf(strings, str -> str.contains("a"));
        System.out.println("Ilosc w % spelniajacych warunek: " + result);

        List<Integer> numbers = Arrays.asList(1, 4, 6, 8, 12, 3, 15);
        result = StatisticsUtil.partOf(numbers, number -> number % 2 == 0);
        System.out.println("Ilosc w % parzystych: " + result);
    }
}
