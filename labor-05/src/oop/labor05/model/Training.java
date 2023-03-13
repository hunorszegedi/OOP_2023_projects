package oop.labor05.model;

import oop.labor02.MyDate;

import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student) {
        if (enrolledStudents.contains(student)) {
            return false;
        } else enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String ID) {
        for (Student temp : enrolledStudents) {
            if (temp.getID().equals(ID)) {
                return temp;
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    public int numEnrolled() {
        return enrolledStudents.size();
    }

    public void printToFile() {

    }

    public void unEnroll(String ID) {
        for (Student temp: enrolledStudents){
            if (temp.getID().equals(ID)){
                temp = null;
            }
        }

    }

    @Override
    public String toString() {
        return "\tTraining\n" +
                "Course: " + course +
                "Start Date: " + startDate +
                "End Date: " + endDate +
                "Price Per Student: " + pricePerStudent +
                "Enrolled student: " + enrolledStudents +
                "\n";
    }
}
