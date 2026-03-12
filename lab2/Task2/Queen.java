package lab2.Task2;

public class Queen extends Piece{
    private final String symbol = "♕";
    public Queen(Position a){
        super(a);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if((b.getCol() < 1 || b.getCol() > 8) || (b.getRow() > 8 || b.getRow() < 1) ) return false;
        boolean direct = (a.getCol() == b.getCol()) || (b.getRow() == a.getRow());
        boolean diagonal = (Math.abs(a.getCol() - b.getCol())) == (Math.abs(b.getRow()) - a.getRow());
        return direct || diagonal;
    }

    public String getSymbol() {
        return symbol;
    }
}
