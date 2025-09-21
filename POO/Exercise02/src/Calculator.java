public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double sum(){
        return a + b;
    }

    public double subtraction(){
        return a - b;
    }

    public double multiplication(){
        return a * b;
    }

    public double division(){
        return a / b;
    }

    public double exponentiation(){
        return Math.pow(a, b);
    }

    @Override
    public String toString(){
        return "Sum: " + sum() + ", Subtraction: " + subtraction() + ", Multiplication: " + multiplication() + ", Division: " + division() + ", Exponentiation: " + String.format("%.2f", exponentiation());
    }
}
