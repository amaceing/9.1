//Anthony Mace  CSC205AB
//This program ...


public class Rectangle implements TwoDShapes{
    private int _length;
    private int _width;

    public Rectangle(int length, int width) {
        _length = length;
        _width = width;
    }

    public int getLength() {
        return _length;
    }

    public int getWidth() {
        return _width;
    }

    @Override
    public int calculateArea() {
        return _length * _width;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (_length + _width);
    }

    public String toString() {
        return "Length: " + _length + "\n" +
               "WidthL : " + _width;
    }
}
