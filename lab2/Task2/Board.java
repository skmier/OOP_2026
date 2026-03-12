package lab2.Task2;

    public class Board {
        private Piece[][] cells = new Piece[8][8];
        public void drawBoard(){
            System.out.println("   1 2 3 4 5 6 7 8");
            System.out.println("  -----------------");
            for (int i = 7; i >= 0; i--) {
                System.out.print((i + 1) + "| ");
                for (int j = 0; j < 8; j++) {
                    if (cells[i][j] == null) {
                        System.out.print(". ");
                    } else {
                        System.out.print(cells[i][j].getSymbol() + " ");
                    }
                }
                System.out.println("|");
            }
        }

        public void setPiece(int r, int c, Piece p){
            cells[r-1][c-1] = p;
        }

        public void moveTo(Piece p, int c, int r){
            if(p.isLegalMove(new Position(c,r))) {
                Piece t = cells[r-1][c-1];
                if(t != null){
                    System.out.println("You cannot move there");
                    return;
                }
                cells[p.a.getRow() - 1][p.a.getCol() - 1] = null;
                cells[r-1][c-1] = p;
                p.a = new Position(c,r);
                drawBoard();
            } else {
                System.out.println("Impossible to move");
            }
        }

        public static void main(String[] args) {
            Board b = new  Board();
            Rook r1 = new Rook(new Position(1,1));
            Rook r2 = new Rook(new Position(8,1));
            Knight kn1 = new Knight(new Position(2,1));
            Knight kn2 = new Knight(new Position(7,1));
            Bishop b1 = new Bishop(new Position (3,1));
            Bishop b2 = new Bishop(new Position (6,1));
            Queen q1 = new Queen(new Position (4, 1));
            King k1 = new King(new Position (5,1));
            Pawn p1 = new Pawn(new Position(8,2));
            b.drawBoard();
            b.setPiece(1,1,r1);
            b.setPiece(1,2,kn1);
            b.setPiece(1,3,b1);
            b.setPiece(1,4,q1);
            b.setPiece(1,5,k1);
            b.setPiece(1,6,b2);
            b.setPiece(1,7,kn2);
            b.setPiece(1,8,r2);
            b.setPiece(2,8,p1);
            b.drawBoard();

            b.moveTo(r1,1,4);
            b.moveTo(kn1,3,3);
            b.moveTo(b1,1,3);
            b.moveTo(q1,4,8);
            b.moveTo(k1,4,2);
            b.moveTo(p1,8,3);
            b.moveTo(r2,7,1);
        }
    }
