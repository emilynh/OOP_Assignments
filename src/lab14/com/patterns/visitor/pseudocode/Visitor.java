package lab14.com.patterns.visitor.pseudocode;

public interface Visitor {
    String visitDot(Dot d);
    String visitCircle(Circle c);
    String visitRectangle(Rectangle r);
    String visitCompoundShape(CompoundShape cs);
}
