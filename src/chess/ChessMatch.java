package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

//pricipal classe do sistema
public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8); // definindo tamanho do tabuleiro
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns();j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat; // retorna matriz de peças da partida
    }

    private void initialSetup(){
        board.placePiece(new Rook(board,Color.WHITE), new Position(4,1));
        board.placePiece(new King(board,Color.WHITE), new Position(7,3));
    }
}
