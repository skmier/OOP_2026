package practice2;

public class Student {
    private String name;
    private String id;
    private int yearOfStudy = 2025;
    private static int yearCnt;

    private double grade; // for lab1
    private static int idCnt = 0;

    {
        idCnt++;
        this.id = idCnt + "";
    }


    public Student(double grade){
        this.grade = grade;
    }

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }

    Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }


    public void incrementYear(){
        yearCnt++;
        this.yearOfStudy += yearCnt;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    @Override
    public String toString() {
        return grade + " (Student " + name + ", id: " + id + ")";
    }
}
