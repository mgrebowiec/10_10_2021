package pl.sda.mg.zadanie15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Car {
    FERRARI(1, 100),
    PORSCHE(1, 99),
    MERCEDES(2, 80),
    BMW(2, 70),
    OPEL(3, 50),
    FIAT(100, 20),
    TOYOTA(50, 55)
    ;

    private static final List<Car> premiumCars = Arrays.asList(FERRARI, PORSCHE, MERCEDES);

    private final double price;
    private final double power;

    Car(double price, double power) {
        this.price = price;
        this.power = power;
    }

    public static List<Car> getCheapCars() {
        return Stream.of(values())
                .filter(car -> car.price < 50)
                .collect(Collectors.toList());
    }

    public boolean isCheap() {
        return price < 50;
    }

    public boolean isRegular() {
        return !premiumCars.contains(this);
    }

    public boolean isPremium() {
        return premiumCars.contains(this);
    }

    public boolean isFasterThan(Car car) {
        return this.power > car.power;
    }

    public static List<Car> getPremiumCars() {
        return premiumCars;
    }
}
