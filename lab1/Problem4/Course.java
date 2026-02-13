package lab1.Problem4;

public class Course {
    private String name;
    private String description;
    private int numberOfCredits;
    private String prerequisite;

    Course(String name, String description, int numberOfCredits, String prerequisite){
        this.name = name;
        this.description = description;
        this.numberOfCredits = numberOfCredits;
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return "Name of course: " + name + "Description: " + description + "Num of credits: " + numberOfCredits + "Prerequisite: " +prerequisite;
    }
}
