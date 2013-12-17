//Anthony Mace  CSC205AB
//This program ...


public class Rectangle implements TwoDShapes{
    private double _length;
    private double _width;

    public Rectangle(double length, double width) {
        _length = length;
        _width = width;
    }

    public double getLength() {
        return _length;
    }

    public double getWidth() {
        return _width;
    }

    @Override
    public double calculateArea() {
        return _length * _width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (_length + _width);
    }

    public String toString() {
        return "Length: " + _length + "\n" +
               "WidthL : " + _width;
    }
}
