package oop.labor05.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDateLabor5 startDate;
    private MyDateLabor5 endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Training(Course course, MyDateLabor5 startDate, MyDateLabor5 endDate, double pricePerStudent) {
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

    public void printToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("Course: " + course);
            writer.println("Start Date: " + startDate);
            writer.println("End Date: " + endDate);
            writer.println("Price Per Student: " + pricePerStudent);
            writer.println("Enrolled Students: ");
            for (Student student : enrolledStudents) {
                writer.println("\t" + student);
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void unEnroll(String ID) {
        for (Student temp: enrolledStudents){
            if (temp.getID().equals(ID)){
                enrolledStudents.remove(temp);
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "\t\tTraining\n" +
                "Course: " + course +
                "Start Date: " + startDate +
                "End Date: " + endDate +
                "Price Per Student: " + pricePerStudent +
                "\n\n\tEnrolled students:\n" + enrolledStudents +
                "\n";
    }
}
