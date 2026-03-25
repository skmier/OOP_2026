package practice4.Problem2;

public class Student extends Person implements CanHavePizza , Movable, CanHaveRetake{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println("Student " + this.getName() + " is dancing");
    }

    @Override
    public void retakeExam() {
        System.out.println("Student " + this.getName() + " has retake");
    }

    @Override
    public void eatPizza() {
        System.out.println("Student " + getName() + " is eating pizza");
    }
}
