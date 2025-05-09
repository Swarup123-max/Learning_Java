package Exception_Handling;

public class insufficentFundsException extends Exception{
    private double amt;
    public insufficentFundsException( double amount){

amt = amount;
    }
    @Override
    public String toString() {
     
        return super.toString();
    }
    
}
