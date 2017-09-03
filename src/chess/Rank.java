package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Piece.Color;
import utils.StringUtils;

public class Rank {
	List<Piece> pieces = new ArrayList<>();

	private void addPiece(Piece piece) {
		pieces.add(piece);
	}
	
	public Piece getPiece(int index) {
		return pieces.get(index);
	}

	public static Rank createWhitePawn() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.addPiece(Piece.createWhitePawn());
		}
		return rank;
	}

	public static Rank createBlackPawn() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.addPiece(Piece.createBlackPawn());
		}
		return rank;
	}

	public static Rank createBlackPieces() {
		Rank rank = new Rank();
		rank.addPiece(Piece.createRook(Color.BLACK));
		rank.addPiece(Piece.createKnight(Color.BLACK));
		rank.addPiece(Piece.createBishop(Color.BLACK));
		rank.addPiece(Piece.createQueen(Color.BLACK));
		rank.addPiece(Piece.createKing(Color.BLACK));
		rank.addPiece(Piece.createBishop(Color.BLACK));
		rank.addPiece(Piece.createKnight(Color.BLACK));
		rank.addPiece(Piece.createRook(Color.BLACK));
		return rank;

	}

	public static Rank createWhitePieces() {
		Rank rank = new Rank();
		rank.addPiece(Piece.createRook(Color.WHITE));
		rank.addPiece(Piece.createKnight(Color.WHITE));
		rank.addPiece(Piece.createBishop(Color.WHITE));
		rank.addPiece(Piece.createQueen(Color.WHITE));
		rank.addPiece(Piece.createKing(Color.WHITE));
		rank.addPiece(Piece.createBishop(Color.WHITE));
		rank.addPiece(Piece.createKnight(Color.WHITE));
		rank.addPiece(Piece.createRook(Color.WHITE));
		return rank;
	}

	public static Rank createBlank() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.addPiece(Piece.createBlank());
		}
		return rank;
	}

	public String show() {
		StringBuilder sb = new StringBuilder();
		for (Piece piece : pieces) {
			sb.append(piece.getRerepresentation());
		}
		return sb.append(StringUtils.NEWLINE).toString();
	}

}
