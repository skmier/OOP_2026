package lab2.Task2;

public class Bishop extends Piece{
    private final String symbol = "♗";

    public Bishop(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if((b.getCol() < 1 || b.getCol() > 8) || (b.getRow() > 8 || b.getRow() < 1) ) return false;
        return Math.abs(a.getRow() - b.getRow()) == Math.abs(a.getCol() - b.getCol());
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
