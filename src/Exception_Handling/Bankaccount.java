package Exception_Handling;

public class Bankaccount {
    private double balance;
    public Bankaccount(double amount){
        this.balance= amount;
    }
    public void withdraw(double amount) throws insufficentFundsException{
        if(amount>balance){
            throw new insufficentFundsException(100);
        }
        balance-=amount;
        System.out.println(balance);
    }
}
