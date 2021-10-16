package pl.sda.mg.zadanie5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SdaHashSet extends HashSet<String> {
    private Set<String> mySet = new TreeSet<>();

    @Override
    public boolean add(String s) {
        System.out.println("Dodajemy do zbioru wartosc: " + s);
        return mySet.add(s);
    }

    @Override
    public boolean remove(Object o) {
        return mySet.remove(o);
    }

    @Override
    public int size() {
        return mySet.size();
    }

    @Override
    public boolean contains(Object o) {
        return mySet.contains(o);
    }

    @Override
    public void clear() {
        mySet.clear();
    }

    @Override
    public String toString() {
        String output = "[";
        for (String s: mySet) {
            output += s;
            output += ", ";
        }
        output += "]";
        return output;
    }
}
