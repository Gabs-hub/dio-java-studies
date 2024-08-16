package classes;

public class Juice {
    String flavor;

    public Juice(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "Juice: " + flavor;
    }
}