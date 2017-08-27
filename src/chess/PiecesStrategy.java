package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public interface PiecesStrategy {
	List<Piece> create(int index);
}
