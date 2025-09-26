public class Main{
    public static void main(String[] args){
        Student firstStudent = new Student("Lucas", 1001, "Ciências da computação");
        System.out.println(firstStudent.toString());

        System.out.println();

        Student secondStudent = new Student("Natalia", 1002, "Odontologia");
        System.out.println(secondStudent.toString());
    }
}