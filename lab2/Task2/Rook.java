package lab2.Task2;

public class Rook extends Piece{
    private final String symbol = "♖";

    public String getSymbol() {
        return symbol;
    }

    public Rook(Position a) {
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if((b.getCol() < 1 || b.getCol() > 8) || (b.getRow() > 8 || b.getRow() < 1) ) return false;
        return a.getCol() == b.getCol() || a.getRow() == b.getRow();
    }

}
