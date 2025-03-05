package com.bridgelabz.generics;

import java.util.*;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void evaluate();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by written exams.");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by assignments.");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " is evaluated by research papers.");
    }
}

class Course<T extends CourseType> {

    List<T> courses = new ArrayList<>();
    public void addCourses(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("\nCourse: " + course.getCourseName());
            course.evaluate();
        }
    }
}

public class MultiLevelUniversityCourseManagement {
    public static void main(String[] args) {

        Course<ExamCourse> examCourse = new Course<>();
        Course<AssignmentCourse> assignmentCourse = new Course<>();
        Course<ResearchCourse> researchCourse = new Course<>();

        examCourse.addCourses(new ExamCourse("Mathematics"));
        assignmentCourse.addCourses(new AssignmentCourse("C language"));
        researchCourse.addCourses(new ResearchCourse("Machine learning"));

        System.out.println("\nDisplaying all courses:");

        Course.displayAllCourses(examCourse.getCourses());
        Course.displayAllCourses(assignmentCourse.getCourses());
        Course.displayAllCourses(researchCourse.getCourses());
    }
}
