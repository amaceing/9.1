//Anthony Mace  CSC205AB
//This program ...

import java.awt.*;

public class Rectangle extends SimpleShape {
    private int _length;
    private int _width;

    public Rectangle(int width, int length) {
        _width = width;
        _length = length;
    }

    public int getWidth() {
        return _width;
    }

    public int getLength() {
        return _length;
    }

    @Override
    public int calculateArea() {
        return _length * _width;
    }

    @Override
    public int calculatePerimeter() {
        return 2 * (_length + _width);
    }

    @Override
    public void drawSelf(int xCoord, int yCoord) {
        Graphics plane = getPlane();
        super.setUpPlane();
        plane.fillRect(xCoord, yCoord, _width, _length);

    }

    @Override
    public String toString() {
        return "Width: " + _width + "\n" +
               "Length: " + _length;
    }
}
