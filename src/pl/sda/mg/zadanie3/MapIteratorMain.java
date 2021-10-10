package pl.sda.mg.zadanie3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIteratorMain {
    public static void main(String[] args) {
        Map<String, String> sampleInputMap = new HashMap<>();
        sampleInputMap.put("jeden", "1");
        sampleInputMap.put("dwa", "2");
        sampleInputMap.put("trzy", "3");
        sampleInputMap.put("aaaa", "bbbb");

        printMapInClassicWay(sampleInputMap);
        printMapUsingIterator(sampleInputMap);
    }

    private static void printMapInClassicWay(Map<String, String> inputMap) {
        Set<Map.Entry<String, String>> inputSet = inputMap.entrySet();

        int elementIndex = 1;
        for (Map.Entry<String, String> entry : inputSet) {
            String text = "Klucz: " + entry.getKey()
                    + ", Wartosc: " + entry.getValue();

            if (elementIndex < inputSet.size()) {
                text += ","; // text = text + ","
            } else {
                text += ".";
            }

            System.out.println(text);

            elementIndex++;
        }
    }

    private static void printMapUsingIterator(Map<String, String> inputMap) {
        Set<Map.Entry<String, String>> inputSet = inputMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = inputSet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String text = "Klucz: " + entry.getKey()
                    + ", Wartosc: " + entry.getValue();

            if (iterator.hasNext()) {
                text += ",";
            } else {
                text += ".";
            }

            System.out.println(text);
        }

    }

}
