import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first note of student: ");
        double note01 = input.nextDouble();

        System.out.print("Enter the second note of student: ");
        double note02 = input.nextDouble();

        System.out.print("Enter the third note of student: ");
        double note03 = input.nextDouble();

        Note note = new Note(note01, note02, note03);
        System.out.println(note.averageNote());

        input.close();
    }
}