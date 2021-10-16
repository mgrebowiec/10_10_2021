package pl.sda.mg.zadanie8;

public class ParcelValidator implements Validator {

    private static final ParcelValidator parcelValidator = new ParcelValidator();

    private ParcelValidator() {

    }

    public static boolean validateStatic(Parcel input) {
        return parcelValidator.validate(input);
    }

    @Override
    public boolean validate(Parcel input) {
        if (input.getxLength() + input.getyLength() + input.getzLength() >= 300) {
            System.out.println("suma nie jest mniejsza od 300");
            return false;
        }

        if (input.getyLength() < 30) {
            System.out.println("Y mniejsze niz 30");
            return false;
        }

        if (input.getzLength() < 30) {
            System.out.println("Z mniejsze niz 30");
            return false;
        }

        if (input.getxLength() < 30) {
            System.out.println("X mniejsze niz 30");
            return false;
        }

        if (!input.isExpress() && input.getWeight() >= 30) {
            System.out.println("Waga przekroczyła 30 i isExpress jest false");
            return false;
        }

        if (input.isExpress() && input.getWeight() >= 15) {
            System.out.println("Waga przekroczyła 15 i isExpress jest true");
            return false;
        }

        return true;
    }
}
