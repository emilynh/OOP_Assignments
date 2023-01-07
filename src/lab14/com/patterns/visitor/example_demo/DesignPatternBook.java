package lab14.com.patterns.visitor.example_demo;

public class DesignPatternBook implements ProgrammingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "Head First Design Patterns";
    }

    public String getBestSeller() {
        return "HUS";
    }
}

