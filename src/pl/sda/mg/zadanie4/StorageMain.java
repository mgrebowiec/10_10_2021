package pl.sda.mg.zadanie4;

public class StorageMain {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("polska", "lodz");
        storage.addToStorage("polska", "krakow");
        storage.addToStorage("polska", "warszawa");

        storage.findValues("krakow");
        storage.printValues("polska");
    }
}
