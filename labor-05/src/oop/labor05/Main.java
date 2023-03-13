package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course course : courses) {
            System.out.println(course);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student student : students) {
            System.out.println(student);
        }
//        Training training = new Training("Matematika", );

    }

    public static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] tokens = line.split(",");
                String ID = tokens[0].trim();
                String firstName = tokens[1].trim();
                String lastName = tokens[2].trim();

                Student student = new Student(ID, firstName, lastName);
                students.add(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static ArrayList<Course> readCourses(String filename) {
        ArrayList<Course> courses = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] tokens = line.split(",");
                String name = tokens[0].trim();
                String description = tokens[1].trim();
                int numhours = Integer.parseInt(tokens[2].trim());

                Course course = new Course(name, description, numhours);
                courses.add(course);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return courses;
    }

}
