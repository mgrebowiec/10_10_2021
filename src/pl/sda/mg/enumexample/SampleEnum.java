package pl.sda.mg.enumexample;

import java.util.stream.Stream;

public enum SampleEnum {
    ONE("jeden", 1),
    TWO("two", 2),
    TEN("dziesiec", 10)
    ;

    private final String value;
    private final int intValue;

    SampleEnum(String value, int intValue) {
        this.value = value;
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getValue() {
        return value;
    }

    public static SampleEnum getFromText(String input) {

//        for (SampleEnum sampleEnum : values()) {
//            if (sampleEnum.value.equalsIgnoreCase(input)) {
//                return sampleEnum;
//            }
//        }
//
//        throw new IllegalArgumentException("Nieprawidlowa wartosc pola input!");


        return Stream.of(values())
                .filter(sampleEnum -> sampleEnum.getValue().equalsIgnoreCase(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nieprawidlowa wartosc pola input!"));
    }
}
