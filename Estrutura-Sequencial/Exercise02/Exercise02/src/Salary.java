public class Salary {
    private double salaryUser;

    public Salary(double salaryUser){
        this.salaryUser = salaryUser;
    }

    public double getSalaryUser(){
        return salaryUser;
    }

    public double increaseSalary(){
        return salaryUser + (salaryUser * 0.25);
    }

    @Override
    public String toString(){
        return "The new salary is: " + increaseSalary();
    }
}
