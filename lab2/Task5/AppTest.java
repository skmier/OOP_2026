package lab2.Task5;

public class AppTest {
     public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26,"AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        // John goes on vacation and leaves Rex with Alice
        john.leavePetWith(alice);
        // Registry reflects that Alice is taking care of Rex
        System.out.println(registry);
        // John returns from vacation and retrieves Rex
        john.retrievePetFrom(alice);
        // Registry reflects that John has his dog back
        System.out.println(registry);

        Person p1 = new Student("Meiir", 20, 2);
        Person p2 = new Employee("SomeOne",22,"Worker");

        PersonRegistry r2 = new PersonRegistry();
        r2.addPerson(p1);
        r2.addPerson(p2);

        p1.leavePetWith(p2);
    }
}
