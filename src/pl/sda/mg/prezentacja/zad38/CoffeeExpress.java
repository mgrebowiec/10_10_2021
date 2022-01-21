package pl.sda.mg.prezentacja.zad38;

public class CoffeeExpress {

    private boolean emptyWaterTank = false;

    private int waterLevel = 3;

    public synchronized void makeCoffee() throws InterruptedException {
        while (emptyWaterTank) {
            System.out.printf("%s czeka na napelnienie zbiornika!\n", Thread.currentThread().getName());
            wait();
        }

        getWater();
        System.out.printf("%s zaparzyl kawe!\n", Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void fillWaterTank() throws InterruptedException {
        while (!emptyWaterTank) {
            System.out.printf("%s czeka na pusty zbiornik!\n", Thread.currentThread().getName());
            wait();
        }

        waterLevel = 3;
        emptyWaterTank = false;
        System.out.printf("%s uzupelnil wode w ekspresie.\n", Thread.currentThread().getName());
        notifyAll();
    }

    private void getWater() {
        waterLevel--;
        if (waterLevel <= 0) {
            emptyWaterTank = true;
        }
    }
}
