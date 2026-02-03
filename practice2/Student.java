package practice2;

public class Student {
    private String name;
    private String id;
    private int yearOfStudy;

    private static int yearCnt;

    {
        yearCnt++;
        this.yearOfStudy = 2026 + yearCnt;
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
}
