package shapes;

//public class Square extends Rectangle
//{
//    public Square(double side)
//    {
//        super(side, side);
//    }
//
//    public double getArea()
//    {
//        return Math.pow(length, 2);
//    }
//
//    public double getPerimeter()
//    {
//        return length * 4;
//    }
//
//}
public class Square extends Quadrilateral
{

    public Square(double length, double width) {
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
}