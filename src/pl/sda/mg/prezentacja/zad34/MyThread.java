package pl.sda.mg.prezentacja.zad34;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.printf("Watek: %s\n", getName());
    }
}
