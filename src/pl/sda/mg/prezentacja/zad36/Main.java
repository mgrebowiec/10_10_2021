package pl.sda.mg.prezentacja.zad36;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPlaygroundRunnable("michal"));
        Thread t2 = new Thread(new ThreadPlaygroundRunnable("janek"));

        t1.start();
        t2.start();
    }
}
