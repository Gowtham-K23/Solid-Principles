interface Shape
{
    double area();
}

class Rectangle implements Shape
{
    private double width;
    private double height;

    public Rectangle(double w, double h)
    {
        this.width = w;
        this.height = h;
    }

    @Override
    public double area()
    {
        return width * height;
    }
}

class Square implements Shape
{
    private double side;

    public Square(double side)
    {
        this.side = side;
    }

    @Override
    public double area()
    {
        return side * side;
    }
}

public class LSP1
{
    public static void main(String[] args)
    {
        Shape rect = new Rectangle(10, 20);
        Shape sq = new Square(15);

        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Square Area: " + sq.area());
    }
}