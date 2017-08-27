package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Position;

public class BlackPiecesMakePiecesStrategy implements MakePiecesStrategy {
	List<Piece> pieces = new ArrayList<Piece>();

	@Override
	public List<Piece> makePieces(int index) {
		pieces.add(Piece.createBlackRook(new Position(0, index)));
		pieces.add(Piece.createBlackKnight(new Position(1, index)));
		pieces.add(Piece.createBlackBishop(new Position(2, index)));
		pieces.add(Piece.createBlackQueen(new Position(3, index)));
		pieces.add(Piece.createBlackKing(new Position(4, index)));
		pieces.add(Piece.createBlackBishop(new Position(5, index)));
		pieces.add(Piece.createBlackKnight(new Position(6, index)));
		pieces.add(Piece.createBlackRook(new Position(7, index)));
		return pieces;
	}

}
