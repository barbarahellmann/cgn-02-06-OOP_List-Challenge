package org.example;



import java.util.ArrayList;
import java.util.List;

public class Student {
    public String firstName;
    public String lastName;
    public int studentID;


    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
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
