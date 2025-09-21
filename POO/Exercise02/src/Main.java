public class Main{
    public static void main(String[] args){
        Calculator calculate = new Calculator(6, 10);

        calculate.sum();
        calculate.subtraction();
        calculate.multiplication();
        calculate.division();
        calculate.exponentiation();

        System.out.println(calculate.toString());
    }
}