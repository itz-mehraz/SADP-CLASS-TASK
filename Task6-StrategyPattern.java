// Step 1: Define a strategy interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Implement concrete payment strategies
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using credit card " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }
}

// Step 3: Create a context class that uses the strategy
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int totalAmount) {
        paymentStrategy.pay(totalAmount);
    }
}

// Step 4: Client code
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Choose a payment strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPayment("example@example.com");

        // Set the payment strategy in the shopping cart
        cart.setPaymentStrategy(creditCardPayment);

        // Perform a checkout
        cart.checkout(100);

        // Change the payment strategy
        cart.setPaymentStrategy(paypalPayment);

        // Perform another checkout
        cart.checkout(50);
    }
}
