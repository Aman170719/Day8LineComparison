import java.util.Objects;
import java.util.Scanner;

public class LineComparison {
    //Constants
    static Double x1, x2, y1, y2, p1, p2, q1, q2;

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        LineComparison.EnterDistance();
        LineComparison.lineLength();
        LineComparison.lineLengthTwo();
        LineComparison.difference();
    }
        // Functions of the programme
    public static void difference() {
        if ((Objects.equals(lineLength(), lineLengthTwo()))) {
            if (lineLength() > lineLengthTwo()) {
                System.out.println("The line 1 is Greater then the Line 2 ");
            } else if (lineLengthTwo() > lineLength()) {
                System.out.println("The line 2 is Greater then the Line 1 ");
            } else {
                System.out.println("The Length are equal");
            }
        }
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
        System.out.println("Enter the value for the Next Line");
        System.out.println("p1");
        p1 = Double.valueOf(scan.next());
        System.out.println("p2");
        p2 = Double.valueOf(scan.next());
        System.out.println("q1");
        q1 = Double.valueOf(scan.next());
        System.out.println("q2");
        q2 = Double.valueOf(scan.next());
    }

    //finding the length of the line
    public static double lineLength() {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    //finding the length 2nd time
    public static Double lineLengthTwo() {
        return (Math.sqrt((p2 - p1) * (p2 - p1) + (q2 - q1) * (q2 - q1)));
    }
}

