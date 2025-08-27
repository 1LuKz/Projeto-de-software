import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee salary: ");
        double employeeSalary = input.nextDouble();

        Employee employees = new Employee(employeeSalary);
        employees.salary();
        System.out.println(employees.toString());

        input.close();
    }
}