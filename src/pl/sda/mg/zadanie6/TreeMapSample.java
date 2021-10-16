package pl.sda.mg.zadanie6;

import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) {
        TreeMap<String, String> sampleMap = new TreeMap<>();
        sampleMap.put("jeden", "1");
        sampleMap.put("dwa", "2");
        sampleMap.put("trzy", "3");
        printElements(sampleMap);
    }

    private static void printElements(TreeMap<String,String> input) {
        System.out.println(input.firstEntry());
        System.out.println(input.lastEntry());
    }
}
