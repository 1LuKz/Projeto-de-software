import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();

        Salary salary1 = new Salary(salary);
        salary1.increaseSalary();
        System.out.println(salary1.toString());

        input.close();
    }
}