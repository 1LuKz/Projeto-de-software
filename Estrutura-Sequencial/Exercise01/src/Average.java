public class Average {
    private double firstNumber;
    private double secondNumber;
    private double thirdNumber;

    public Average(double firstNumber, double secondNumber, double thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public double getThirdNumber(){
        return thirdNumber;
    }

    public double averageCalculate(){
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }

    @Override
    public String toString(){
        return "The average is: " + averageCalculate();
    }
}
