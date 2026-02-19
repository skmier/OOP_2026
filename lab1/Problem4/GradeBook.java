package lab1.Problem4;

import practice2.Student;

import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private Course course;
    private List<Student> students = new ArrayList<>();


    private double total = 0;

    public void addStudent(String name, double grade) {
        Student s1 = new Student(name, grade);
        total += s1.getGrade();
        students.add(s1);
    }

    public void displayMessage(){
        System.out.println("Welcome to the grade book for CS101 OOP");
    }

    public void displayGradeReport(){
        System.out.println("Class average is " + determineAverage() +" . Lowest grade is " + getLowestGrade().toString() + " Highest grade is " + getHighestGrade().toString());
    }

    public Student getLowestGrade(){
        Student myStudent = new Student(Byte.MAX_VALUE);
        for (Student s : students){
            if(s.getGrade() < myStudent.getGrade() ){
                myStudent.setGrade(s.getGrade());
                myStudent.setName(s.getName());
            }
        }
        return myStudent;
    }

    public Student getHighestGrade(){
        Student myStudent = new Student(0.0);

        for (Student s : students){
            if(s.getGrade() > myStudent.getGrade()){
                myStudent.setGrade(s.getGrade());
                myStudent.setName(s.getName());
            }
        }
        return myStudent;
    }

    public void outputBarChart(){
        int A100 = 0, A90 = 0, B80 = 0, D70 = 0, C60 = 0, D50 = 0, F = 0;

        for(Student s : students){
            if (s.getGrade() == 100) A100++;
            else if(s.getGrade() >= 90 && s.getGrade() <= 99) A90++;
            else if (s.getGrade() >= 80 && s.getGrade() < 90) B80++;
            else if (s.getGrade() >= 70 && s.getGrade() < 80) D70++;
            else if (s.getGrade() >= 60 && s.getGrade() < 70) C60++;
            else if (s.getGrade() >= 50 && s.getGrade() < 60) D50++;
            else F++;
        }

        System.out.println("Grade Distribution: ");
        System.out.println("0-50:   " + "*".repeat(F));
        System.out.println("50-60:  " + "*".repeat(D50));
        System.out.println("60-70:  " + "*".repeat(C60));
        System.out.println("70-80:  " + "*".repeat(B80));
        System.out.println("90-99:  " + "*".repeat(A90));
        System.out.println("100:    " + "*".repeat(A100));
    }

    public double determineAverage(){
        return  total / students.size() ;
    }
}
