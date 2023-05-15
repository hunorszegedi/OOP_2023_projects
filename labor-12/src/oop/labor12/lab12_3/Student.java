package oop.labor12.lab12_3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private long ID;
    private String firstName;
    private String lastName;
    private Map<String, Double> grades = new HashMap<>(); //ha elemparokrol van szo, akkor az Map
    private double average; //erettsegi atlag

    public Student(long ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }

    public void addGrade(String subject, double grade) {
        this.grades.put(subject, grade);
    }

    public double getGrade(String subject) {
        Double grade = this.grades.get(subject);
        if (grade == null) {
            throw new RuntimeException("Unknown subject");
        }
        return grade;
    }

    public void calculateAverage() {
        double average = 0;
        for (Double grade : grades.values()) {
            if (grade < 5) {
                return;
            }
            average += grade;
        }
        if (grades.size() == 0) {
            System.out.println("No grades: " + this.ID);
            return;
        }
        average = average / grades.size();
        if (average >= 6) {
            this.average = average;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }

}

