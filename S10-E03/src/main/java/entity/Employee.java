package entity;

public class Employee {

    private Integer id;
    private String name;
    private double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * percentage / 100.0;
    }

    public String toString() {
        return  id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
