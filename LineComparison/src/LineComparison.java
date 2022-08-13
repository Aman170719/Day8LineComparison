import java.util.Scanner;

public class LineComparison {
    //Constants
    static Double x1, x2, y1, y2, p1, p2, q1, q2;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        LineComparison.EnterDistance();
        LineComparison.lineLength();
    }

    //Enter the distance values
    public static void EnterDistance() {
        System.out.println("Enter the Values of the following");
        Scanner scan = new Scanner(System.in);
        System.out.println("x1");
        x1 = Double.valueOf(scan.next());
        System.out.println("x2");
        x2 = Double.valueOf(scan.next());
        System.out.println("y1");
        y1 = Double.valueOf(scan.next());
        System.out.println("y2");
        y2 = Double.valueOf(scan.next());
    }
    //finding the length of the line
    public static void lineLength() {
        int length = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line is : " +length);
    }
}
