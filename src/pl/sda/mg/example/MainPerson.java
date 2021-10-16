package pl.sda.mg.example;

public class MainPerson {
    public static void main(String[] args) {
        Person jan = new Person("jan", "kowalski", "111");
        Person jan2 = new Person("jan", "kowalski", "1111");
        Person jan3 = new Person("jan", "nowak", "111");

        Object jan4 = new Person("jan", "nowak", "111");

        System.out.println(jan.equals(jan4));
    }
}
