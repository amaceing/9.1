//Anthony Mace  CSC205AB
//This program ...

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow{
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;
    private static final JFrame main = new JFrame("ShapeMaker");
    private int _shapeWidth;
    private int _shapeLength;

    public MainWindow() {
        main.setSize(WIDTH, HEIGHT);
        main.setLayout(new BorderLayout());
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.getContentPane().setBackground(Color.darkGray);
        main.setLocation(300, 100);
        addMenu();
        main.setVisible(true);
    }

    public void addMenu() {
        JMenu shapeMenu = new JMenu("Shapes");
        JMenu calcMenu = new JMenu("Calculate");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem rect = new JMenuItem("Rectangle");
        rect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String widthInput = JOptionPane.showInputDialog(main, "Enter width: ");
                _shapeWidth = Integer.parseInt(widthInput);
                String lengthInput = JOptionPane.showInputDialog(main, "Enter length: ");
                _shapeLength = Integer.parseInt(lengthInput);
                drawRect();
            }
        });
        JMenuItem oval = new JMenuItem("Oval");
        oval.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String widthInput = JOptionPane.showInputDialog(main, "Enter width: ");
                _shapeWidth = Integer.parseInt(widthInput);
                String lengthInput = JOptionPane.showInputDialog(main, "Enter length: ");
                _shapeLength = Integer.parseInt(lengthInput);
                drawOval();
            }
        });
        JMenuItem area = new JMenuItem("Area");
        area.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int area = _shapeWidth * _shapeLength;
                JOptionPane.showMessageDialog(null, "The area of this shape is: " +
                                              area);
            }
        });
        JMenuItem per = new JMenuItem("Perimeter");
        per.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int per = 2 * (_shapeWidth + _shapeLength);
                JOptionPane.showMessageDialog(null, "The perimeter of this shape is: " +
                                              per);
            }
        });
        JMenuItem contact = new JMenuItem("Contact");
        JMenuItem about = new JMenuItem("About");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This will be cleared");
            }
        });
        shapeMenu.add(rect);
        shapeMenu.add(oval);
        calcMenu.add(area);
        calcMenu.add(per);
        editMenu.add(clear);
        helpMenu.add(contact);
        helpMenu.add(about);
        JMenuBar bar = new JMenuBar();
        bar.add(shapeMenu);
        bar.add(calcMenu);
        bar.add(editMenu);
        bar.add(helpMenu);
        bar.setBackground(Color.lightGray);
        bar.setForeground(Color.darkGray);
        main.setJMenuBar(bar);
    }

    public void calcArea(TwoDShapes shape) {
        int area = shape.calculateArea();
        JOptionPane.showMessageDialog(null, "The area of this shape is: " + area);
    }

    public void calcPerimeter(TwoDShapes shape) {
        int perimeter = shape.calculatePerimeter();
        JOptionPane.showMessageDialog(null, "The perimeter of this shape is: "
                                      + perimeter);
    }

    public Rectangle drawRect() {
        Rectangle rect = new Rectangle(_shapeWidth, _shapeLength);
        rect.setBackground(Color.darkGray);
        main.add(rect, BorderLayout.CENTER);
        main.validate();
        main.repaint();
        return rect;
    }

    public void drawOval() {
        Oval oval = new Oval(_shapeWidth, _shapeLength);
        oval.setBackground(Color.darkGray);
        main.add(oval, BorderLayout.CENTER);
        main.add(oval);
        main.validate();
        main.repaint();
    }

}
