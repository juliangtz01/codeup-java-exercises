package shapes;

abstract class Quadrilateral extends Shape implements Measurable
{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return this.length;
    }

    abstract void setLength(double length);

    public double getWidth() {
        return this.width;
    }

    abstract void setWidth(double width);
}
