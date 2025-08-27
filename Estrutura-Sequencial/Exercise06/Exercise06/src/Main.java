import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the b value: ");
        double b = input.nextDouble();

        System.out.print("Enter the c value: ");
        double c = input.nextDouble();

        Triangle triangle = new Triangle(b, c);
        triangle.hypotenuse();
        System.out.println(triangle.toString());

        input.close();
    }
}