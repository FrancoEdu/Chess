package boardgame;

public class Piece{
    protected Position position;
    private Board board;

    public Piece(Board board){ //posição de uma peça recem criada será nula
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "Piece: " +
                "position=" + position;
    }
}
