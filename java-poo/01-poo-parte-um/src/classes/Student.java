package classes;

public class Student {
    String name;
    int age;
    Color color;
    Sex sex;

    void eating(Lunch lunch) {
        System.out.println(name + " is eating " + lunch);
    }

    void drinking(Juice juice) {
        System.out.println(name + " is drinking " + juice);
    }

    void running() {
        System.out.println(name + " is running");
    }
}
