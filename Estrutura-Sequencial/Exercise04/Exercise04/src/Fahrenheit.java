public class Fahrenheit {
    private double celsius;

    public Fahrenheit(double celsius){
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double celsiusToFahrenheit(){
        return (celsius * 1.8) + 32;
    }

    @Override
    public String toString(){
        return "The Fahrenheit temperature is: " + celsiusToFahrenheit();
    }
}
