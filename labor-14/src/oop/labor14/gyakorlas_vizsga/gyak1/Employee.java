package oop.labor14.gyakorlas_vizsga.gyak1;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private int dateOfYear;

    public Employee(String name, int salary, int dateOfYear) {
        this.name = name;
        this.salary = salary;
        this.dateOfYear = dateOfYear;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDateOfYear() {
        return dateOfYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDateOfYear(int dateOfYear) {
        this.dateOfYear = dateOfYear;
    }

    public String createMessage(Employee e){
        return "Hello" + getName();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dateOfYear=" + dateOfYear +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.salary, o.salary);
    }
}

