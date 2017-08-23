package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import static utils.StringUtils.*;

public class Board {
	private List<Rank> board = new ArrayList<Rank>();

	public void initialize() {
		board.add(Rank.initializeBlackPieces());
		board.add(Rank.initializeBlackPawns());
		board.add(Rank.initializeBlank());
		board.add(Rank.initializeBlank());
		board.add(Rank.initializeBlank());
		board.add(Rank.initializeBlank());
		board.add(Rank.initializeWhitePawns());
		board.add(Rank.initializeWhitePieces());
	}

	private String getPieceResult(Rank rank) {
		StringBuilder sb = new StringBuilder();
		for (Piece piece : rank.getPieces()) {
			sb.append(piece.getRepresentation());
		}
		return sb.toString();
	}

	public int pieceCount() {
		return 32;
	}

	public String showBoard() {
		StringBuilder sb = new StringBuilder();
		for( Rank rank : board) {
			sb.append(appendNewLine(getPieceResult(rank)));
		}
		return sb.toString();
	}

}
