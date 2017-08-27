package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public interface MakePiecesStrategy {
	// List<Piece> pieces = new ArrayList<Piece>();
	List<Piece> makePieces(int index);
}
