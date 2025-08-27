import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ray value: ");
        double ray = input.nextDouble();

        Circle circle = new Circle(ray);
        System.out.println(circle.length());
        System.out.println(circle.area());
        System.out.println(circle.volume());

        input.close();
    }
}