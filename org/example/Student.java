package org.example;



import java.util.ArrayList;
import java.util.List;

public class Student {
    public String firstName;
    public String lastName;
    public int studentID;


    List<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public void addCourse(Course newCourse){
        courses.add(newCourse);
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                '}';



    }
}
