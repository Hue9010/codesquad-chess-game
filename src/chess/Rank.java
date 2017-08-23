package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public class Rank {

	private List<Piece> pieces = new ArrayList<Piece>();

	private void pieceAdd(Piece piece) {
		pieces.add(piece);
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public static Rank initializeWhitePieces() {
		Rank rank = new Rank();
		rank.pieceAdd(Piece.createWhiteRook());
		rank.pieceAdd(Piece.createWhiteKnight());
		rank.pieceAdd(Piece.createWhiteBishop());
		rank.pieceAdd(Piece.createWhiteQueen());
		rank.pieceAdd(Piece.createWhiteKing());
		rank.pieceAdd(Piece.createWhiteBishop());
		rank.pieceAdd(Piece.createWhiteKnight());
		rank.pieceAdd(Piece.createWhiteRook());
		return rank;
	}

	public static Rank initializeBlackPieces() {
		Rank rank = new Rank();
		rank.pieceAdd(Piece.createBlackRook());
		rank.pieceAdd(Piece.createBlackKnight());
		rank.pieceAdd(Piece.createBlackBishop());
		rank.pieceAdd(Piece.createBlackQueen());
		rank.pieceAdd(Piece.createBlackKing());
		rank.pieceAdd(Piece.createBlackBishop());
		rank.pieceAdd(Piece.createBlackKnight());
		rank.pieceAdd(Piece.createBlackRook());
		return rank;
	}

	public static Rank initializeWhitePawns() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.pieceAdd(Piece.createWhitePawn());
		}
		return rank;
	}

	public static Rank initializeBlackPawns() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.pieceAdd(Piece.createBlackPawn());
		}
		return rank;
	}

	public static Rank initializeBlank() {
		Rank rank = new Rank();
		for (int i = 0; i < 8; i++) {
			rank.pieceAdd(Piece.createBlank());
		}
		return rank;
	}

	// public void addWhitePawn(Piece pawn) {
	// whitePawns.add(pawn);
	// }
	//
	// public void addBlackPawn(Piece pawn) {
	// blackPawns.add(pawn);
	// }
	//
	// public int size() {
	// return whitePawns.size() + blackPawns.size();
	// }

	// public String getWhitePawnsResult() {
	// return getPieceResult(whitePawns);
	// }
	//
	// public String getBlackPawnsResult() {
	// return getPieceResult(blackPawns);
	// }
	//
	// private String getWhitePiecesResult() {
	// return getPieceResult(whitePieces);
	// }
	//
	// private String getBlackPiecesResult() {
	// return getPieceResult(blackPieces);
	// }
	//
	// private String getBlankRankResult() {
	// return getPieceResult(blackPieces);
	// }

}
