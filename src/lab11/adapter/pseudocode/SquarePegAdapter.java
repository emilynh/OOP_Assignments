package lab11.adapter.pseudocode;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth());
        this.peg = squarePeg;
    }
    public int getRadius(){
        return (int)(peg.getWidth()*Math.sqrt(2)/2);
    }
}
