package classes;

public class School {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        student1.name = "John";
        student1.age = 12;
        student1.color = Color.FAIR;
        student1.sex = Sex.MALE;

        Student student2 = new Student();
        student2.name = "Sophia";
        student2.age = 10;
        student2.color = Color.FAIR;
        student2.sex = Sex.FEMALE;

        Student student3 = new Student();
        student3.name = "Lily";
        student3.age = 11;
        student3.color = Color.DARK;
        student3.sex = Sex.FEMALE;

        Lunch lunch1 = new Lunch("Pizza");
        Juice juice1 = new Juice("Apple");

        student1.eating(lunch1);
        student2.drinking(juice1);
        student3.running();
    }
}

