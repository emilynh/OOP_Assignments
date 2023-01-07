package lab7.exercise1_4;

public class TestMovable {
    public static void main(String[] args) {
        Movable center = new MovablePoint(2, 3, 4, 5);
        System.out.println(center);
        center.moveLeft();
        System.out.println(center);
        center.moveRight();
        System.out.println(center);
        center.moveDown();
        System.out.println(center);
        MovableCircle circle = new MovableCircle(2, 3, 4, 5, 2);
        circle.moveUp();
        System.out.println(circle);
        circle.moveLeft();
        System.out.println(circle);
        circle.moveDown();
        System.out.println(circle);
    }
}

//MovablePoint[(x, y) speed=4,5]
//MovablePoint[(x, y) speed=4,5]
//MovablePoint[(x, y) speed=4,5]
//MovablePoint[(x, y) speed=4,5]
//MovablePoint[MovablePoint[(x, y) speed=4,5], radius=2]
//MovablePoint[MovablePoint[(x, y) speed=4,5], radius=2]
//MovablePoint[MovablePoint[(x, y) speed=4,5], radius=2]