public class Triangle {
    private double b;
    private double c;

    public Triangle(double b, double c){
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double hypotenuse(){
        return Math.sqrt((b * b) + (c * c));
    }

    @Override
    public String toString(){
        return "The hypotenuse is: " + hypotenuse();
    }
}
