package EpisodeD;

// Part of D1
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        rectangle1.length = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the length of the rectangle1"));
        rectangle1.width = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the width of the rectangle1"));

        rectangle2.length = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the length of the rectangle2"));
        rectangle2.width = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter the width of the rectangle2"));

        if (rectangle1.isBiggerThan(rectangle2) || rectangle2.isBiggerThan(rectangle1)) {
            System.out.println(rectangle1.isBiggerThan(rectangle2) ?
                    "The perimeter of the rectangle with the bigger area is: " +
                            rectangle1.getPerimeter() :
                    "The perimeter of the rectangle with the bigger area is: " +
                            rectangle2.getPerimeter());
        } else {
            System.out.println("The area of the rectangles is area");
        }
    }
}
