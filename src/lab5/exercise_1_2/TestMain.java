package exercise_1_2;

public class TestMain {
    public static void main(String[] args){
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1);
        Circle circle2 = new Circle();
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }

}
//Circle[radius=1.1]
//Circle[radius=1.0]
//Circle[radius=2.2]
//radius is: 2.2
//area is: 15,21
//circumference is: 13,82
