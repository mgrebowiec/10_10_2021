package pl.sda.mg.zadanie7;

import java.util.ArrayList;
import java.util.List;

public class Pistol {
    private final int pistolSize;
    private List<String> bullets;

    public Pistol(int pistolSize) {
        this.pistolSize = pistolSize;
        this.bullets = new ArrayList<>();
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < pistolSize) {
            bullets.add(bullet);
        } else {
            System.out.println("Magazynek jest pelny");
        }
    }

    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    public void shot() {
        if (isLoaded()) {
            String bullet = bullets.remove(bullets.size() - 1);
            System.out.println("Wystrzelilismy pocisk: " + bullet);
            if (!isLoaded()) {
                System.out.println("Pusty magazynek");
            }
        } else {
            System.out.println("Zaladuj naboje");
        }
    }
}
