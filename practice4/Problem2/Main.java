package practice4.Problem2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Someone", 100);
        Cat c1 = new Cat("Kuki",5);
        Student s1 = new Student("Sanji", 19);

        Restaurant r1 = new Restaurant();
        r1.servePizza(c1);
        r1.servePizza(s1);

        System.out.println("\nStudent");
        s1.dance();
        s1.retakeExam();
    }
}
