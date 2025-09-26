public class Main{
    public static void main(String[] args){
        CurrentAccount myAccount = new CurrentAccount(101, 15);

        myAccount.deposit(500);
        System.out.println(myAccount.toString());
        myAccount.withdraw(1500);
        myAccount.withdraw(500);
        System.out.println(myAccount.toString());
    }
}