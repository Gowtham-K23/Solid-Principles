// Abstract base class (Closed for modification, Open for extension)

abstract class Notifier
{
    public abstract void send(String message);
}

// Concrete implementation: Email

class EmailNotifier extends Notifier
{
    @Override
    public void send(String message)
    {
        System.out.println("Sending Email: " + message);
    }
}

// Concrete implementation: SMS

class SMSNotifier extends Notifier
{
    @Override
    public void send(String message)
    {
        System.out.println("Sending SMS: " + message);
    }
}

// Concrete implementation: Push Notification

class PushNotifier extends Notifier
{
    @Override
    public void send(String message)
    {
        System.out.println("Sending Push Notification: " + message);
    }
}

// Client class that uses any notifier

class NotificationService
{
    public void notifyUser(Notifier notifier, String message)
    {
        notifier.send(message);
    }
}

// Main class

public class OCP2
{
    public static void main(String[] args) 
    {
        NotificationService service = new NotificationService();

        Notifier email = new EmailNotifier();
        service.notifyUser(email, "Welcome to our app!");

        Notifier sms = new SMSNotifier();
        service.notifyUser(sms, "Your OTP is 123456");

        Notifier push = new PushNotifier();
        service.notifyUser(push, "You have a new friend request!");
    }
}