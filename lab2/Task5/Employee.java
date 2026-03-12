package lab2.Task5;


public class Employee extends Person{
    private String job;

    public Employee(String name, int age, Animal animal, String job) {
        super(name, age, animal);
        this.job = job;
    }


    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String getOccupation() {
        return "Job: " + job;
    }

}
