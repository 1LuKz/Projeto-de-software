import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the major diagonal: ");
        double majorDiagonal = input.nextDouble();

        System.out.print("Enter the minor diagonal: ");
        double minorDiagonal = input.nextDouble();

        Rhombus rhombus = new Rhombus(majorDiagonal, minorDiagonal);
        rhombus.areaRhombus();
        System.out.println(rhombus.toString());

        input.close();
    }
}