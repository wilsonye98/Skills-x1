package main;

import university.Course;
import university.Enrollment;
import university.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.studentId = 11003;
        student.name = "Johnny 2 Hat";

        Course course = new Course();
        course.courseId = 113;
        course.courseName = "Java Programming";

        Enrollment enroll = new Enrollment();
        enroll.course = course;
        enroll.student = student;

        System.out.println("Student: " + student.name + " ID: " + student.studentId);
        System.out.println("Course: " + course.courseName + " ID: " + course.courseId);
        System.out.println("Enrolling " + enroll.student.name + " in " + enroll.course.courseName);
    }
}
