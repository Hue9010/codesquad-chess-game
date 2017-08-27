package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Position;

public class BlankMakePiecesStrategy implements MakePiecesStrategy {
	List<Piece> pieces = new ArrayList<Piece>();

	@Override
	public List<Piece> makePieces(int index) {
		for (int i = 0; i < 8; i++) {
			pieces.add(Piece.createBlank(new Position(i, index)));
		}
		return pieces;
	}

}
