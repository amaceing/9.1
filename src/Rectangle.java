//Anthony Mace  CSC205AB
//This program ...

import java.awt.*;
import javax.swing.*;

public class Rectangle extends JPanel implements TwoDShapes {
    private int _width;
    private int _length;

    public Rectangle(int width, int length) {
        _width = width;
        _length = length;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.lightGray);
        g.fillRect(75, 75, _width, _length);
    }

    public int calculateArea() {
        return _width * _length;
    }

    public int calculatePerimeter() {
        return 2 * (_width + _length);
    }
}
