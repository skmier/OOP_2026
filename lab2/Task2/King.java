package lab2.Task2;

public class King extends Piece{
    public String getSymbol() {
        return symbol;
    }

    private final String symbol = "♚";
    public King(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if((b.getCol() < 1 || b.getCol() > 8) || (b.getRow() > 8 || b.getRow() < 1) ) return false;
        int rowDiff = Math.abs(a.getRow() - b.getRow());
        int colDiff = Math.abs(a.getCol() - b.getCol());
        return rowDiff <= 1 && colDiff <= 1;
    }
}
