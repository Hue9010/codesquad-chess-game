package chess;

import java.util.ArrayList;

import pieces.Piece;
import static utils.StringUtils.*;

public class Board {
	private ArrayList<Rank> rankBoard = new ArrayList<Rank>();

	private ArrayList<Piece> whitePawns = new ArrayList<Piece>();
	private ArrayList<Piece> blackPawns = new ArrayList<Piece>();
	private ArrayList<Piece> whitePieces = new ArrayList<Piece>();
	private ArrayList<Piece> blackPieces = new ArrayList<Piece>();
	private ArrayList<Piece> blankRank = new ArrayList<Piece>();

	public void initialize() {
		whitePieces.add(Piece.createWhiteRook());
		whitePieces.add(Piece.createWhiteKnight());
		whitePieces.add(Piece.createWhiteBishop());
		whitePieces.add(Piece.createWhiteQueen());
		whitePieces.add(Piece.createWhiteKing());
		whitePieces.add(Piece.createWhiteBishop());
		whitePieces.add(Piece.createWhiteKnight());
		whitePieces.add(Piece.createWhiteRook());

		for (int i = 0; i < 8; i++) {
			addWhitePawn(Piece.createWhitePawn());
			addBlackPawn(Piece.createBlackPawn());
			blankRank.add(Piece.createBlank());
		}

		blackPieces.add(Piece.createBlackRook());
		blackPieces.add(Piece.createBlackKnight());
		blackPieces.add(Piece.createBlackBishop());
		blackPieces.add(Piece.createBlackQueen());
		blackPieces.add(Piece.createBlackKing());
		blackPieces.add(Piece.createBlackBishop());
		blackPieces.add(Piece.createBlackKnight());
		blackPieces.add(Piece.createBlackRook());

	}

	public void addWhitePawn(Piece pawn) {
		whitePawns.add(pawn);
	}

	public void addBlackPawn(Piece pawn) {
		blackPawns.add(pawn);
	}

	public int size() {
		return whitePawns.size() + blackPawns.size();
	}

	public String getWhitePawnsResult() {
		return getPieceResult(whitePawns);
	}

	public String getBlackPawnsResult() {
		return getPieceResult(blackPawns);
	}

	private String getWhitePiecesResult() {
		return getPieceResult(whitePieces);
	}

	private String getBlackPiecesResult() {
		return getPieceResult(blackPieces);
	}

	private String getBlankRankResult() {
		return getPieceResult(blackPieces);
	}

	private String getPieceResult(ArrayList<Piece> pieces) {
		StringBuilder sb = new StringBuilder();
		for (Piece piece : pieces) {
			sb.append(piece.getRepresentation());
		}
		return sb.toString();
	}

	public int pieceCount() {
		return whitePawns.size() + blackPawns.size() + whitePieces.size() + blackPieces.size();
	}

	public String showBoard() {
		StringBuilder sb = new StringBuilder();
		sb.append(appendNewLine(getBlackPiecesResult()));
		sb.append(appendNewLine(getBlackPawnsResult()));
		sb.append(appendNewLine(getBlankRankResult()));
		sb.append(appendNewLine(getBlankRankResult()));
		sb.append(appendNewLine(getBlankRankResult()));
		sb.append(appendNewLine(getBlankRankResult()));
		sb.append(appendNewLine(getWhitePawnsResult()));
		sb.append(appendNewLine(getWhitePiecesResult()));
		return sb.toString();
	}

}
