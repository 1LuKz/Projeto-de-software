import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height: ");
        double height = input.nextDouble();

        System.out.print("Enter the weight: ");
        double weight = input.nextDouble();

        Imc imc = new Imc(height, weight);
        System.out.println(imc.calculateIMC());

        input.close();
    }
}