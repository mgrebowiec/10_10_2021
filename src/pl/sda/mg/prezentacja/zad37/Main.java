package pl.sda.mg.prezentacja.zad37;

import pl.sda.mg.prezentacja.zad36.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 11; i++) {
            executor.execute(new ThreadPlaygroundRunnable("--->" + i));
        }
    }
}
