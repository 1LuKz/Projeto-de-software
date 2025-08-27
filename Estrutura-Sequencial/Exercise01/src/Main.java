import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = input.nextDouble();

        Average average = new Average(firstNumber, secondNumber, thirdNumber);
        average.averageCalculate();
        System.out.println(average.toString());

        input.close();
    }
}