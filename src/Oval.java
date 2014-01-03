//Anthony Mace  CSC205AB
//This program ...

import java.awt.*;
import javax.swing.*;

public class Oval extends JPanel {
    private int _width;
    private int _length;

    public Oval(int width, int length) {
        _width = width;
        _length = length;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.lightGray);
        g.fillOval(75, 75, _width, _length);
    }


}
