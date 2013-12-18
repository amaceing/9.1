//Anthony Mace  CSC205AB
//This program is designed to allow the user
//to create and store 3D shapes

import java.util.*;
import java.awt.*;

public class Project1 {

    public static final Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        drawRectangle();
    }

    public static void drawRectangle() {
        System.out.println("You chose to draw a rectangle!");
        int length = getUserLength();
        int width = getUserWidth();
        Rectangle rect = new Rectangle(length, width);
        int xCoord = getXCoordinate();
        int yCoord = getYCoordinate();
        int panelXDimension = width + 100;
        int panelYDimension = length + 100;
        DrawingPanel panel = new DrawingPanel(panelXDimension, panelYDimension);
        Graphics plane = panel.getGraphics();
        plane.setColor(Color.pink);
        plane.drawLine(10, 0, 10, panelYDimension);
        plane.drawLine(0, 10, panelXDimension, 10);
        plane.fillRect(xCoord, yCoord, rect.getWidth(), rect.getLength());
        System.out.println();
    }

    public static int getUserLength() {
        int length = 0;
        System.out.print("Enter the length of the rectangle (in.): ");
        length = console.nextInt();
        System.out.println();
        return length;
    }

    public static int getUserWidth() {
        int width = 0;
        System.out.print("Enter the width of the rectangle (in.): ");
        width = console.nextInt();
        System.out.println();
        return width;
    }

    public static int getXCoordinate() {
        int x = 0;
        do {
            System.out.print("Enter the x coordinate: ");
            x = console.nextInt();
            if (x > 950) {
                System.out.println("That x coordinate is too large for the window!");
            }
        } while(x > 950);
        System.out.println();
        return x;
    }

    public static int getYCoordinate() {
        int y = 0;
        do {
            System.out.print("Enter the x coordinate: ");
            y = console.nextInt();
            if (y > 700) {
                System.out.println("That y coordinate is too large for the window!");
            }
        } while(y > 700);
        System.out.println();
        return y;
    }

}
