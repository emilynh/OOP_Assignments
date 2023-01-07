package lab7.exercise1_5;

public class TestMain {
    public static void main(String[] args){
        GeometricObject circle1 = new Circle(3.0);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        ResizableCircle circle2 = new ResizableCircle(4.0);
        circle2.resize(10);
        System.out.println(circle2);
    }
}

//18.84955592153876
//28.274333882308138
//ResizableCircle{radius=0.4}