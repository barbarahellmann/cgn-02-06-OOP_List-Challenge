package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class School {

    public static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Print all students of the school.
     */

    public static void printStudents(){
        for (Student eachStudent : students){
            System.out.println(eachStudent);
        }
    }

    /**
     * Find a specific student by their ID.
     * @param studentID
     * @return student
     */

    public static Student findStudent(int studentID){
        for (Student eachStudent : students){
            if (eachStudent.studentID == studentID) {
                return eachStudent;
            }
        }
        System.out.println("No student found with this ID.");
        return null;
    }

    /**
     * Method to remove a student from the school.
     * @param studentID
     */

    public static void removeStudent(int studentID){
        for (Student eachStudent : students){
            if (eachStudent.studentID == studentID) {
                System.out.println("Removing student: " + eachStudent.firstName + ", " + eachStudent.lastName);
                students.remove(eachStudent);
            }
        }
        System.out.println("No student found with this ID.");
    }
}
