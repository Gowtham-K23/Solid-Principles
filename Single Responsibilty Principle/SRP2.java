//Separate each responsibility into different classes

class Invoice
{
    private String item;
    private int quantity;
    private double price;

    public Invoice(String item, int quantity, double price)
    {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem()
    {
        return item;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public double calculate()
    {
        return quantity * price;
    }
}

class InvoiceRepository
{
    public void saveToFile(Invoice invoice)
    {
        System.out.println("Saving invoice of " + invoice.getItem() + " to file...");
    }
}

class InvoicePrinter
{
    public void print(Invoice invoice)
    {
        System.out.println("Invoice Details:");
        System.out.println(invoice.getItem() + " x " + invoice.getQuantity() +
                           " @ " + invoice.getPrice() + " each");
        System.out.println("Total: " + invoice.calculate());
    }
}

public class SRP2
{
    public static void main(String[] args) 
    {
        Invoice invoice = new Invoice("Laptop", 2, 55000.0);

        InvoicePrinter printer = new InvoicePrinter();
        printer.print(invoice);

        InvoiceRepository repo = new InvoiceRepository();
        repo.saveToFile(invoice);
    }
}