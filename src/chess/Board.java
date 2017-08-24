package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import pieces.Position;

import static utils.StringUtils.*;

public class Board {
	private List<Rank> ranks = new ArrayList<Rank>();

	public void initialize() {
		ranks.add(Rank.initializeWhitePieces(0));
		ranks.add(Rank.initializeWhitePawns(1));
		ranks.add(Rank.initializeBlank(2));
		ranks.add(Rank.initializeBlank(3));
		ranks.add(Rank.initializeBlank(4));
		ranks.add(Rank.initializeBlank(5));
		ranks.add(Rank.initializeBlackPawns(6));
		ranks.add(Rank.initializeBlackPieces(7));
	}

	private String getPieceResult(Rank rank) {
		StringBuilder sb = new StringBuilder();
		for (Piece piece : rank.getPieces()) {
			sb.append(piece.getRepresentation());
		}
		return sb.toString();
	}

	public int pieceCount(Color color, Type type) {
		int count = 0;
		for (Rank rank : ranks) {
			count += rank.pieceCount(color, type);
		}
		return count;
	}

	public String showBoard() {
		StringBuilder sb = new StringBuilder();
		// for (Rank rank : ranks) {
		// sb.append(appendNewLine(getPieceResult(rank)));
		// }
		for (int i = ranks.size() - 1; i >= 0; i--) {
			sb.append(appendNewLine(getPieceResult(ranks.get(i))));
		}
		return sb.toString();
	}

	public Piece findPiece(String string) {
		Position position = new Position(string);
		return ranks.get(position.getYIndex()).findPiece(position.getXIndex());
	}

}
