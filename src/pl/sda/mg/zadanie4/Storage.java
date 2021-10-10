package pl.sda.mg.zadanie4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> storage = new HashMap<>();

    public void addToStorage(String key, String value) {
        List<String> values = storage.get(key);
        if (values == null) {
            // tworzymy nową listę
            values = new ArrayList<>();
            // dodajemy do niej wartość z parametru value
            values.add(value);
            // dodajemy parę (klucz:wartość) do mapy storage
            storage.put(key, values);
        } else {
            // dodać do listy value
            values.add(value);
        }
    }

    public void printValues(String key) {
        System.out.println(storage.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : storage.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }

}
