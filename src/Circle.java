import java.util.ArrayList;
import java.util.Scanner;

public class Circle {
    double radius = 1.0;

    double area;
    double circumference;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void creator() {
        ArrayList<Circle> list = new ArrayList<Circle>();
        Scanner myScan = new Scanner(System.in);
        int ans = myScan.nextInt();
        for (int i = 0; i <= ans; i++) ;
        {
            double w = myScan.nextDouble();
            Circle y = new Circle(w);
            list.add(y);
        }
    }


    //getset
    public double getRadius() {
        return radius;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public double getArea() {
        double ar = Math.PI * (radius * radius);
        return ar;
    }

    public double getCircumference(double radius) {
        double circl = (2 * radius * Math.PI);
        return circl;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
