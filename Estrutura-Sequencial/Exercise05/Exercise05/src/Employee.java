public class Employee {
    private double salaryEmployee;
    private double basicSalary;

    public Employee(double salaryEmployee){
        this.salaryEmployee = salaryEmployee;
        basicSalary = 1518.00;
    }

    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    public double salary(){
        return salaryEmployee / basicSalary;
    }

    @Override
    public String toString(){
        return String.format("The salary employee is equal: %.2f basic salary", salary());
    }
}
