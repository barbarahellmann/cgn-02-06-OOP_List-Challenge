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

    public static  List<Course> retrieveAllCourses(int studentID){
        for (Student eachStudent : School.students){
            if (eachStudent.studentID == studentID) {
                System.out.println("The Student " + eachStudent.firstName + " " + eachStudent.lastName
                        + " attends this courses: " + eachStudent.courses.toString() + ".");
                return eachStudent.courses;
            }
        }
        System.out.println("No student found with this ID. So we cannot give you the courses.");
        return null;
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
