package lab2.Task2;

public class Knight extends Piece{
    private final String symbol = "♘";

    public Knight(Position a) {
        super(a);;
    }

    @Override
    public boolean isLegalMove(Position b) {
        if((b.getCol() < 1 || b.getCol() > 8) || (b.getRow() > 8 || b.getRow() < 1) ) return false;
        int rowDiff = Math.abs(b.getRow() - a.getRow());
        int collDiff = Math.abs(a.getCol() - b.getCol());
        return (rowDiff == 2 && collDiff == 1) || (rowDiff == 2 && collDiff == 2);
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
