package oop.labor05;

import oop.labor05.model.Course;
import oop.labor05.model.MyDateLabor5;
import oop.labor05.model.Student;
import oop.labor05.model.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


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

        //For each course create a separate Training
        Course course1 = courses.get(0);
        Course course2 = courses.get(1);
        Course course3 = courses.get(2);
        Course course4 = courses.get(3);
        Course course5 = courses.get(4);

        //Training
        //The startDate will be 2023.03.21 and the end date 2023.03.25.
        MyDateLabor5 startDate = new MyDateLabor5(2023, 3, 21);
        MyDateLabor5 endDate = new MyDateLabor5(2023, 3, 25);

        //The price should be generated randomly between 1000 and 2000 EUR.
        Random random1 = new Random();
        int randomEuro1 = random1.nextInt(1000) + 1000;
        Random random2 = new Random();
        int randomEuro2 = random2.nextInt(1000) + 1000;
        Random random3 = new Random();
        int randomEuro3 = random3.nextInt(1000) + 1000;
        Random random4 = new Random();
        int randomEuro4 = random4.nextInt(1000) + 1000;
        Random random5 = new Random();
        int randomEuro5 = random5.nextInt(1000) + 1000;

        //craeting training
        Training training1 = new Training(course1, startDate, endDate, randomEuro1);
        Training training2 = new Training(course2, startDate, endDate, randomEuro2);
        Training training3 = new Training(course3, startDate, endDate, randomEuro3);
        Training training4 = new Training(course4, startDate, endDate, randomEuro4);
        Training training5 = new Training(course5, startDate, endDate, randomEuro5);

        ArrayList<Training> trainings = new ArrayList<>();
        trainings.add(training1);
        trainings.add(training2);
        trainings.add(training3);
        trainings.add(training4);
        trainings.add(training5);

        Random rand = new Random();

        // Enroll 10 students randomly in each training
        for (Training training : trainings) {
            while (training.numEnrolled() < 10) {
                int index = rand.nextInt(students.size()); // generate a random index
                Student student = students.get(index); // get the student at that index

                training.enroll(student); // enroll the student into the training
            }
        }

        System.out.println(trainings);

        for (Student student : students) {
            System.out.print(student.getFirstName() + " " + student.getLastName() + ":\n ");
            for (Training training : trainings) {
                if (training.enroll(student)) { // check if student is enrolled in the training
                    System.out.print( "\t" + training.getCourse().getName() + " || "+ training.getCourse().getDescription() + "\n");
                }
            }
            System.out.println("\n");
        }

        training1.printToFile("output.txt");
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
