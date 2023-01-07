package lab14.com.patterns.visitor.pseudocode;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor v);
}

