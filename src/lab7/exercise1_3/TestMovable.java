package lab7.exercise1_3;

import lab7.exercise1_4.Movable;
import lab7.exercise1_4.MovablePoint;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10,20); // upcast
        System.out.println(m1);
        m1.moveLeft();
        m1.moveDown();
        System.out.println(m1);

    }
}

//MovablePoint[(x, y) speed=10,20]
//MovablePoint[(x, y) speed=10,20]