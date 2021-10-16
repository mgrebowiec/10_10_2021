package pl.sda.mg.zadanie8;

public class MainParcel {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(40, 50, 60, 20, false);
        ParcelValidator.validateStatic(parcel);
    }
}
