package pl.sda.mg.zadanie15;

public class CarMain {
    public static void main(String[] args) {
        Car firstCar = Car.OPEL;
        Car secondCar = Car.PORSCHE;

        System.out.println("Czy " + firstCar + " jest szybsze niz " + secondCar + ": "
                + firstCar.isFasterThan(secondCar));

        System.out.println("Samochody premium: " + Car.getPremiumCars());

        System.out.println("Czy " + firstCar + " jest premium: " + firstCar.isPremium());

        System.out.println("Tanie samochody to: " + Car.getCheapCars());
    }
}
