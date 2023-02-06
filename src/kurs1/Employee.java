package kurs1;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private static int id1;
    private int id;


    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id=++id1;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + fullName + '\'' +
                ", отдел=" + department +
                ", зарплата=" + salary +
                ", id=" + id +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
