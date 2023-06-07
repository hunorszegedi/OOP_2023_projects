package oop.labor14.gyakorlas_vizsga.gyak1;

public class Manager extends Employee {
    private int departmentNumber;

    public Manager(String name, int salary, int dateOfYear, int departmentNumber) {
        super(name, salary, dateOfYear);
        this.departmentNumber = departmentNumber;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "department number:"+ getDepartmentNumber();
    }
}
