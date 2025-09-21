public class Employee {
    private String name;
    private Position positionEmployee;
    private double salary;

    public Employee(String name, Position positionEmployee, double salary){
        this.name = name;
        this.positionEmployee = positionEmployee;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(Position positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void promote(Position newPosition, double raise){
        this.positionEmployee = newPosition;
        this.salary += raise;
    }

    public double readjustSalary(double percentage){
        return salary + (salary * percentage);
    }

    public void terminate(){
        this.positionEmployee = Position.Dismiss;
        this.salary = 0;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Position: " + positionEmployee + ", Salary: " + salary;
    }
}
