package pl.sda.mg.zadanie5;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> sampleSet = new SdaHashSet();
        System.out.println("rozmiar poczatkowy: " + sampleSet.size());
        sampleSet.add("pierwszy element");
        System.out.println("rozmiar aktualny: " + sampleSet.size());
        System.out.println("zbior: " + sampleSet);
        System.out.println("usuwamy element...");
        sampleSet.remove("pierwszy element");
        System.out.println("rozmiar aktualny: " + sampleSet.size());
        System.out.println("zbior: " + sampleSet);
        sampleSet.add("pierwszy element");
        sampleSet.clear();
        System.out.println("rozmiar aktualny: " + sampleSet.size());
        System.out.println("zbior: " + sampleSet);
    }
}
