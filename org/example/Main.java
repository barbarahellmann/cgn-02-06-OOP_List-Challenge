/*
Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
Step 2: Create a Java List for elements of type "Student" and add multiple students.
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
Step 5: Add a method to find a student by their ID. The found student should be returned.
Step 6: Create a method to remove a student from the school.
 */


package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Peter", "Pan", 651546);
        Student student2 = new Student("Branden", "Burg", 685435);
        Student student3 = new Student("Harry", "Plotter", 655735);


        School.addStudent(student1);
        School.addStudent(student2);
        School.addStudent(student3);

        School.printStudents();
    }

}