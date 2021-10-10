package pl.sda.mg.zadanie1;

import java.util.ArrayList;
import java.util.List;

public class HumanMain {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Pole());
        humans.add(new Russian());
        humans.add(new German());

        humans.forEach(Human::drink);
    }
}
