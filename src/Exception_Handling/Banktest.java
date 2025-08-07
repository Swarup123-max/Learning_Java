package Exception_Handling;

public class Banktest {
    public static void main(String[] args) {

        Bankaccount bankaccount = new Bankaccount(100);
        try {
            bankaccount.withdraw(103);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}