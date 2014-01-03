//Anthony Mace  CSC205AB
//This program ...

import javax.swing.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow implements ActionListener{
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
        JMenu helpMenu = new JMenu("Help");
        JMenuItem rect = new JMenuItem("Rectangle");
        rect.addActionListener(this);
        JMenuItem oval = new JMenuItem("Oval");
        oval.addActionListener(this);
        JMenuItem area = new JMenuItem("Area");
        JMenuItem per = new JMenuItem("Perimeter");
        JMenuItem contact = new JMenuItem("Contact");
        JMenuItem about = new JMenuItem("About");
        shapeMenu.add(rect);
        shapeMenu.add(oval);
        calcMenu.add(area);
        calcMenu.add(per);
        helpMenu.add(contact);
        helpMenu.add(about);
        JMenuBar bar = new JMenuBar();
        bar.add(shapeMenu);
        bar.add(calcMenu);
        bar.add(helpMenu);
        bar.setBackground(Color.lightGray);
        bar.setForeground(Color.darkGray);
        main.setJMenuBar(bar);
    }

    public void actionPerformed(ActionEvent e) {
        String shape = e.getActionCommand();
        String widthInput = JOptionPane.showInputDialog(main, "Enter width: ");
        int width = Integer.parseInt(widthInput);
        String lengthInput = JOptionPane.showInputDialog(main, "Enter length: ");
        int length = Integer.parseInt(lengthInput);
        if (shape.equals("Rectangle")) {
            drawRect(width, length);
        } else if (shape.equals("Oval")) {
            drawOval(width, length);
        }
    }

    /*public void sideBar() {
        JPanel eastSideBar = new JPanel();
        eastSideBar.setBackground(Color.lightGray);
        JButton area = new JButton("Calculate Area");
        area.setBackground(Color.darkGray);
        area.setForeground(Color.lightGray);
        JButton per = new JButton("Calculate Perimeter");
        per.setBackground(Color.darkGray);
        per.setForeground(Color.lightGray);
        eastSideBar.add(area);
        eastSideBar.add(per);
        main.add(eastSideBar, BorderLayout.EAST);
        main.validate();
    }*/

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
        main.add(oval);
        main.validate();
        main.repaint();
    }

}
