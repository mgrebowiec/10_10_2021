package pl.sda.mg.zad12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CarMain {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("VW", 2000, "Czechy");
        Manufacturer m2 = new Manufacturer("SEAT", 2001, "Hiszpania");
        Manufacturer m3 = new Manufacturer("TOYOTA", 1980, "Japonia");
        Manufacturer m4 = new Manufacturer("Mazda", 1988, "Japonia");
        Manufacturer m5 = new Manufacturer("Kia", 1990, "Korea");
        Manufacturer m6 = new Manufacturer("Nissan", 1979, "Japonia");

        Car c1 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V6);
        Car c2 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V6);
        Car c3 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V8);


        System.out.println("Czy c1 jest taki sam jak c2: " + c1.equals(c2));
        System.out.println("Czy c1 jest taki sam jak c3: " + c1.equals(c3));
        System.out.println("Czy zadziała poprawnie dla null: " + c1.equals(null));

        List<Manufacturer> manufacturers = Arrays.asList(m1, m2, m3, m4, m5, m6);

        List<Manufacturer> filteredManufacturers = get(manufacturers, ComparisonFuncion.LESS_THAN,1982);
        System.out.println("Lista producentow przed 1982:\n" + filteredManufacturers);

        filteredManufacturers = get(manufacturers, ComparisonFuncion.MORE_THAN,1982);
        System.out.println("Lista producentow po 1982:\n" + filteredManufacturers);
    }

    private static List<Manufacturer> get(List<Manufacturer> manufacturers, ComparisonFuncion comparisonFuncion, Integer valueToCompare) {
        return manufacturers.stream()
                .filter(comparisonFuncion.getManufacturerPredicate(valueToCompare))
                .collect(Collectors.toList());
    }
}
