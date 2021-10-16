package pl.sda.mg.zadanie7;

public class MainPistol {
    public static void main(String[] args) {
        Pistol samplePistol = new Pistol(4);
        samplePistol.loadBullet("pierwsza");
        samplePistol.loadBullet("druga");
        samplePistol.loadBullet("trzecia");
        samplePistol.loadBullet("czwarta");

        samplePistol.shot();
        samplePistol.shot();
        samplePistol.shot();
        samplePistol.shot();
        samplePistol.shot();
        samplePistol.shot();
    }
}
