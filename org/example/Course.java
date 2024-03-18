package org.example;

import java.util.Objects;

public class Course {

    public String courseName;
    public String instructor;
    public int room;


    public Course(String courseName, String instructor, int room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room=" + room +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return room == course.room && Objects.equals(courseName, course.courseName) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, instructor, room);
    }
}
