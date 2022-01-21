package pl.sda.mg.prezentacja.zad36;

public class ThreadPlaygroundRunnable implements Runnable {
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.printf("Watek %s (%s): #%d\n", Thread.currentThread().getName(), name, i);
        }
    }
}
