public class Main{
    public static void main(String[] args){
        Employee employee = new Employee("Lucas", Position.Employee, 2545);
        System.out.println(employee.toString());

        employee.promote(Position.Manager, 350);
        System.out.println(employee.toString());

        employee.terminate();
        System.out.println(employee.toString());
    }
}