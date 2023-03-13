package oop.labor05.model;

public class Course {
    private String name;
    private String description;
    private int numHours;

    public Course(String name, String description, int numHours) {
        this.name = name;
        this.description = description;
        this.numHours = numHours;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "\tCourse\n" +
                "Name: " + name + "\n" +
                "Description: " + description + "\n" +
                "NumHours: " + numHours +
                "\n";
    }
}

