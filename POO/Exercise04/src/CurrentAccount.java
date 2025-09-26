public class CurrentAccount {
    private int number;
    private int agency;
    private double balance;

    public CurrentAccount(int number, int agency){
        this.number = number;
        this.agency = agency;
        this.balance = 0.0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString(){
        return "Agência: " + agency + "\nConta: " + number + "\nSaldo: " + balance;
    }
}
