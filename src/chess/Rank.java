package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import pieces.Position;

public class Rank {

	private List<Piece> pieces = new ArrayList<Piece>();
	MakePiecesStrategy makePiecesStrategy;

	public List<Piece> getPieces() {
		return pieces;
	}

	public static Rank initializePieces(int index, MakePiecesStrategy makePiecesStrategy) {
		Rank rank = new Rank();
		rank.pieces = makePiecesStrategy.makePieces(index);
		return rank;
	}

	public Piece findPiece(int xPos) {
		return pieces.get(xPos);
	}

	public void move(int xPos, Piece piece) {
		pieces.set(xPos, piece);
	}

	public List<Piece> findPieceByColor(Color color) {
		List<Piece> piecesByColor = new ArrayList<>();
		for (Piece piece : pieces) {
			piece.addPiecesByColor(color, piecesByColor);
		}
		return piecesByColor;
	}

	public int countPieceByColorAndType(Color color, Type type) {
		int countOfPiece = 0;
		for (Piece piece : pieces) {
			countOfPiece += checkColorType(piece, color, type);
		}
		return countOfPiece;
	}

	private int checkColorType(Piece piece, Color color, Type type) {
		if (piece.checkColorType(color, type)) {
			return 1;
		}
		return 0;
	}

}
