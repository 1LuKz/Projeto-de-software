public class Imc{
    private double height;
    private double weight;

    public Imc(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public String calculateIMC(){
        double imc = weight / (height * height);

        if(imc < 20){
            return "Underweight";
        } else if(imc < 25){
            return "Normal";
        } else if(imc < 30){
            return "Overweight";
        } else if(imc < 40){
            return "Obesity";
        } else {
            return "Morbid obesity";
        }
    }
}