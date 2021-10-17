package pl.sda.mg.enumexample;

public class Main {
    public static void main(String[] args) {
        SampleEnum sampleEnum = SampleEnum.getFromText("JEDEN");
        System.out.println("wartosc liczbowa: " + sampleEnum.getIntValue());

        SampleEnum one = SampleEnum.ONE;
        if (SampleEnum.ONE == one) {
            System.out.println("yupiii!");
        }
    }
}
