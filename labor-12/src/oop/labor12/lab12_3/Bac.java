package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Bac {
    private HashMap<Long, Student> students = new HashMap<>();

    public void readNames(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String items[] = line.split(" ");
                long id = Long.parseLong(items[0].trim());
                Student student = new Student(id, items[1].trim(), items[2].trim());
                students.put(id, student);
            }
//            System.out.println(students.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void readSubjects(String subject) {
        try (Scanner scanner = new Scanner(new File(subject + ".txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String items[] = line.split(" ");
                long id = Long.parseLong(items[0].trim());
                double grade = Double.parseDouble(items[1].trim());
                Student student = this.students.get(id);
                if (student == null) {
                    throw new RuntimeException("Invalid ID!\n");
                }
                student.addGrade(subject, grade);
            }
//            System.out.println(students);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void calculataAverages() {
        for (Student student : students.values()) {
            student.calculateAverage();
        }
    }

    public int numPassed() {
        int counter = 0;
        for (Student student : students.values()) {
            if (student.getAverage() > 0) {
                ++counter;
            }
        }
        return counter;
    }

    //nem atmenok abc sorrendben
    public void printFailed() {
        List<Student> failedStudents = new ArrayList<>();
//        List<Student> allStudents = new ArrayList<>(students.values());
        for (Student student : this.students.values()) {
            if (student.getAverage() == 0) {
                failedStudents.add(student);
            }
        }
        Collections.sort(failedStudents, (student1, student2) -> {
            if (student1.getFirstName().equals(student2.getFirstName())) {
                return student1.getLastName().compareTo(student2.getLastName());
            }
            return student1.getFirstName().compareTo(student2.getFirstName());
        });
        failedStudents.forEach(System.out::println);
    }
}
