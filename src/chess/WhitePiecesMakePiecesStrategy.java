package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Position;

public class WhitePiecesMakePiecesStrategy implements MakePiecesStrategy {
	List<Piece> pieces = new ArrayList<Piece>();

	@Override
	public List<Piece> makePieces(int index) {
		pieces.add(Piece.createWhiteRook(new Position(0, index)));
		pieces.add(Piece.createWhiteKnight(new Position(1, index)));
		pieces.add(Piece.createWhiteBishop(new Position(2, index)));
		pieces.add(Piece.createWhiteQueen(new Position(3, index)));
		pieces.add(Piece.createWhiteKing(new Position(4, index)));
		pieces.add(Piece.createWhiteBishop(new Position(5, index)));
		pieces.add(Piece.createWhiteKnight(new Position(6, index)));
		pieces.add(Piece.createWhiteRook(new Position(7, index)));
		return pieces;
	}

}
