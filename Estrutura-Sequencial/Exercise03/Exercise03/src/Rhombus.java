public class Rhombus {
    private double majorDiagonal;
    private double minorDiagonal;

    public Rhombus(double majorDiagonal, double minorDiagonal){
        this.majorDiagonal = majorDiagonal;
        this.minorDiagonal = minorDiagonal;
    }

    public double getMajorDiagonal() {
        return majorDiagonal;
    }

    public double getMinorDiagonal() {
        return minorDiagonal;
    }

    public double areaRhombus(){
        return majorDiagonal * minorDiagonal / 2;
    }

    @Override
    public String toString(){
        return "The rhombus area is: " + areaRhombus();
    }
}
