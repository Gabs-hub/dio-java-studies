package classes;

public class Lunch {
    String type;

    public Lunch(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lunch: " + type;
    }
}
