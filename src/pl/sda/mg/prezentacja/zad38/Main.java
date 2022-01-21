package pl.sda.mg.prezentacja.zad38;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        CoffeeExpress coffeeExpress = new CoffeeExpress();
        ExecutorService executor = Executors.newFixedThreadPool(6);
        executor.execute(new CoffeeMaker(coffeeExpress));
        executor.execute(new CoffeeMaker(coffeeExpress));
        executor.execute(new CoffeeMaker(coffeeExpress));
        executor.execute(new CoffeeMaker(coffeeExpress));
        executor.execute(new WaterTankFiller(coffeeExpress));
        executor.execute(new WaterTankFiller(coffeeExpress));

        //czekamy kilka sekund i przerywamy dzialanie watkow
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdownNow();

    }

    static class CoffeeMaker implements Runnable {
        private CoffeeExpress coffeeExpress;

        public CoffeeMaker(CoffeeExpress coffeeExpress) {
            this.coffeeExpress = coffeeExpress;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    coffeeExpress.makeCoffee();
                } catch (InterruptedException e) {
                    System.out.printf("%s konczy swoje dzialanie po przerwaniu!", Thread.currentThread().getName());
                    return;
                }
            }
        }
    }

    static class WaterTankFiller implements Runnable {
        private CoffeeExpress coffeeExpress;

        public WaterTankFiller(CoffeeExpress coffeeExpress) {
            this.coffeeExpress = coffeeExpress;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    coffeeExpress.fillWaterTank();
                } catch (InterruptedException e) {
                    System.out.printf("%s konczy swoje dzialanie po przerwaniu!", Thread.currentThread().getName());
                    return;
                }
            }
        }
    }
}
