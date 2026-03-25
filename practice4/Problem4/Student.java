package practice4.Problem4;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;


    public Student(String name, double gpa){
        this.gpa = gpa;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if( this.gpa > o.gpa) return 1;
        else if (this.gpa < o.gpa) return -1;
        else return 0;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " gpa: " + gpa;
    }
}
