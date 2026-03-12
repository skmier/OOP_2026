package lab2.Task5;


public class Student extends Person{
    private int course;

    public Student(String name, int age, Animal animal, int course) {
        super(name, age, animal);
        this.course = course;
    }

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    @Override
    public String getOccupation() {
        return "Student " + getName() + " studies in " + course;
    }
}

