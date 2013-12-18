//Anthony Mace  CSC205AB
//This program ...

import java.awt.*;

public class Oval extends SimpleShape {
    private int _width;
    private int _length;

    public Oval(int width, int length) {
        _width = width;
        _length = length;
    }

    @Override
    public int calculateArea() {
        int area = 0;
        double calcArea = 0.0;
        calcArea = Math.PI * _width * _length;
        area = (int) (calcArea + 0.5);
        return area;
    }

    @Override
    public int calculatePerimeter() {
        int per = 0;
        double calcPer = 0.0;
        calcPer = Math.PI * ((3 *(_width + _length)) -
                  Math.sqrt((3 * _width + _length) * (_width + 3 * _length)));
        per = (int) (calcPer + 0.5);
        return per;
    }

    @Override
    public void drawSelf(int xCoord, int yCoord) {
        Graphics plane = getPlane();
        plane.setColor(Color.darkGray);
        plane.drawLine(getOffset(), 0, getOffset(), getYDim());
        plane.drawLine(0, getOffset(), getXDim(), getOffset());
        plane.drawOval(xCoord, yCoord, _width, _length);
    }

    @Override
    public String toString() {
        return "Width: " + _width + "\n" +
               "Length: " + _length;
    }
}
