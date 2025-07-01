package innerClasses;  // Defines the package name.

public interface Payment {
    void pay(double amt);  // Interface method to process payment.
}

//<--------------------------------------------------------------------------------------------------------------------------->

class ShoppingCart {
    double totalAmt;  // Holds the total amount to be paid.

    public ShoppingCart(double totalAmt) {
        this.totalAmt = totalAmt;  // Initializes the total amount via constructor.
    }

    public void processPayment(Payment paymentMethod)//An object of payment interface
     {
        paymentMethod.pay(totalAmt);  // Delegates the payment to the provided Payment method.
    }
}


//<--------------------------------------------------------------------------------------------------------------------------->

class test {
    public static void main(String[] args) {
        // Create a ShoppingCart object with total amount 150
        ShoppingCart sc = new ShoppingCart(150);

        // Use an anonymous inner class to implement the Payment interface
        // and define the behavior of the pay method on the fly
        sc.processPayment(new Payment() {
            @Override
            public void pay(double amt) {
                // Implementation of the pay method: simply print a message
                System.out.println("Paid " + amt + " using credit card");
            }
        });
    }
}
 


//<--------------------------------------------------------------------------------------------------------------------------->

class Creditcard implements Payment {
    private String number ;
    @Override
    public void pay(double amt) {
        System.out.println("Paid " + amt + " using credit card");  // Implements the pay method.
    }
}

//<--------------------------------------------------------------------------------------------------------------------------->

class test1 {
    public static void main(String[] args) {  // The main method to run the program.
        ShoppingCart sc = new ShoppingCart(150);  // Create a shopping cart with a total amount of 150.
        Creditcard cc = new Creditcard();  // Create a Creditcard payment method.
        sc.processPayment(cc);  // Process payment using the credit card.
    }
}
