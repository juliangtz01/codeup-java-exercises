package shapes;

//public class Rectangle
//{
//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width)
//    {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter()
//    {
//        return (2 * length) + (2 * width);
//    }
//
//    public double getArea()
//    {
//        return length * width;
//    }
//}
public class Rectangle extends Quadrilateral implements Measurable
{

    public Rectangle(double length, double width)
    {
        super(length, width);
    }

    @Override
    void setLength(double length)
    {
        super.length = length;
    }

    @Override
    void setWidth(double width)
    {
        super.width = width;
    }

    public double getArea()
    {
        return 0;
    }

    public double getPerimeter()
    {
        return 0;
    }
}

