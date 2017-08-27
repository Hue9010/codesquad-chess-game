package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Position;

public class WhitePawnPiecesStrategy implements PiecesStrategy {
	List<Piece> pieces = new ArrayList<Piece>();

	@Override
	public List<Piece> create(int index) {
		for (int i = 0; i < 8; i++) {
			pieces.add(Piece.createWhitePawn(new Position(i, index)));
		}
		return pieces;
	}

}
