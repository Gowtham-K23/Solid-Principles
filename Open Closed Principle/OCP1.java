// Base class for payment processing (Open for extension, closed for modification)

abstract class PaymentProcessor
{
    public abstract void processPayment(double amount);
}

class CreditCard extends PaymentProcessor
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal extends PaymentProcessor
{
    @Override
    public void processPayment(double amount)
    {
        System.out.println("Processing Paypal payment of $" + amount);
    }
}

public class OCP1
{
    public static void main(String[] args)
    {
        PaymentProcessor cc = new CreditCard();
        PaymentProcessor pp = new PayPal();

        processPayment(cc, 100.00); //Processing credit card payment
        processPayment(pp, 150.00); //Processing paypal payment
    }

    // Generic method that works for any payment processor
    public static void processPayment(PaymentProcessor processor, double amount)
    {
        processor.processPayment(amount);
    }
}