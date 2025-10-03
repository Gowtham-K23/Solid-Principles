
abstract class Document
{
    protected String content;

    public Document(String content)
    {
        this.content = content;
    }

    // All subclasses must support printing
    public abstract void printContent();
}

// PDF Document
class PDFDocument extends Document
{
    public PDFDocument(String content)
    {
        super(content);
    }

    @Override
    public void printContent()
    {
        System.out.println("Printing PDF Document: " + content);
    }
}

class WordDocument extends Document
{
    public WordDocument(String content)
    {
        super(content);
    }

    @Override
    public void printContent()
    {
        System.out.println("Printing Word Document: " + content);
    }
}

class TextDocument extends Document
{
    public TextDocument(String content)
    {
        super(content);
    }

    @Override
    public void printContent()
    {
        System.out.println("Printing Text Document: " + content);
    }
}

// Client code that works with base class
class DocumentPrinter
{
    public void printDocument(Document doc)
    {
        doc.printContent();
    }
}

public class LSP2
{
    public static void main(String[] args) 
    {
        DocumentPrinter printer = new DocumentPrinter();
        
        Document pdf = new PDFDocument("Java OOPS Principle");
        Document word = new WordDocument("Liskov Substitution Principle");
        Document text = new TextDocument("Hello, World!");

        printer.printDocument(pdf);
        printer.printDocument(word);
        printer.printDocument(text);
    }
}