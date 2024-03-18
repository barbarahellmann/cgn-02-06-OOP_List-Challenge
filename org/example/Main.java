/*
Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
Step 2: Create a Java List for elements of type "Student" and add multiple students.
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
Step 5: Add a method to find a student by their ID. The found student should be returned.
Step 6: Create a method to remove a student from the school.
Bonus 1:
1.1 Expand the Java-List project with a class called "Course" that has the following properties: course name, instructor, room.
1.2. Add a method to the Student class to add courses to the student (courses in which the student is participating).
1.3. Implement a method within the School class to retrieve all courses of a specific student (based on a student ID).
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
        School.findStudent(651546);
        School.findStudent(123456);


        student1.addCourse(new Course("Java", "Dominic",241));
        student2.addCourse(new Course("Web", "Martin",231));
        student3.addCourse(new Course("UX/UI", "Marion",222));
        student1.addCourse(new Course("Web", "Martin",231));
    }

}