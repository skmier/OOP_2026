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

    public double determineAverage(){
        return  total / students.size() ;
    }
}
