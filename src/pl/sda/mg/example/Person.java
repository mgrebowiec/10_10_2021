package pl.sda.mg.example;

public class Person {
    private String name;
    private String surname;
    private String pesel;

    public Person(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        return pesel.equals(((Person) obj).pesel);
    }

    @Override
    public int hashCode() {
        return pesel.hashCode();
    }
}
