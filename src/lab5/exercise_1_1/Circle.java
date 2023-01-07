package lab5.exercise_1_1;

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    public Circle() { // default constructor
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) { //2nd construcotr
        this();
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
