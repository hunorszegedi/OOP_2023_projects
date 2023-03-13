package oop.labor05.model;

public class Student {
    private String ID;
    private String firstName;
    private String lastName;

    //constructor
    public Student(String ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //get methods

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "\tStudent\n" +
                "ID: " + ID + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName +
                "\n";
    }
}
