import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the celsius: ");
        double celsiusNumber = input.nextDouble();

        Fahrenheit fahrenheit = new Fahrenheit(celsiusNumber);
        fahrenheit.celsiusToFahrenheit();
        System.out.println(fahrenheit.toString());

        input.close();
    }
}