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
                int width = Integer.parseInt(widthInput);
                String lengthInput = JOptionPane.showInputDialog(main, "Enter length: ");
                int length = Integer.parseInt(lengthInput);
                drawRect(width, length);
            }
        });
        JMenuItem oval = new JMenuItem("Oval");
        oval.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String widthInput = JOptionPane.showInputDialog(main, "Enter width: ");
                int width = Integer.parseInt(widthInput);
                String lengthInput = JOptionPane.showInputDialog(main, "Enter length: ");
                int length = Integer.parseInt(lengthInput);
                drawOval(width, length);
            }
        });
        JMenuItem area = new JMenuItem("Area");
        area.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        JMenuItem per = new JMenuItem("Perimeter");
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

    public Rectangle drawRect(int width, int length) {
        Rectangle rect = new Rectangle(width, length);
        rect.setBackground(Color.darkGray);
        main.add(rect, BorderLayout.CENTER);
        main.validate();
        main.repaint();
        return rect;
    }

    public void drawOval(int width, int length) {
        Oval oval = new Oval(width, length);
        oval.setBackground(Color.darkGray);
        main.add(oval, BorderLayout.CENTER);
        main.add(oval);
        main.validate();
        main.repaint();
    }

}
