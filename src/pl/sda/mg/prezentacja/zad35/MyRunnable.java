package pl.sda.mg.prezentacja.zad35;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.printf("Watek: %s\n", Thread.currentThread().getName());
    }
}
