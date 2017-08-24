package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import pieces.Position;

public class Rank {

	private List<Piece> pieces = new ArrayList<Piece>();

	private void pieceAdd(Piece piece) {
		pieces.add(piece);
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public static Rank initializeWhitePieces(int index) {
		Rank rank = new Rank();
		rank.pieceAdd(Piece.createWhiteRook(new Position(0, index)));
		rank.pieceAdd(Piece.createWhiteKnight(new Position(1, index)));
		rank.pieceAdd(Piece.createWhiteBishop(new Position(2, index)));
		rank.pieceAdd(Piece.createWhiteQueen(new Position(3, index)));
		rank.pieceAdd(Piece.createWhiteKing(new Position(4, index)));
		rank.pieceAdd(Piece.createWhiteBishop(new Position(5, index)));
		rank.pieceAdd(Piece.createWhiteKnight(new Position(6, index)));
		rank.pieceAdd(Piece.createWhiteRook(new Position(7, index)));
		return rank;
	}

	public static Rank initializeBlackPieces(int index) {
		Rank rank = new Rank();
		rank.pieceAdd(Piece.createBlackRook(new Position(0, index)));
		rank.pieceAdd(Piece.createBlackKnight(new Position(1, index)));
		rank.pieceAdd(Piece.createBlackBishop(new Position(2, index)));
		rank.pieceAdd(Piece.createBlackQueen(new Position(3, index)));
		rank.pieceAdd(Piece.createBlackKing(new Position(4, index)));
		rank.pieceAdd(Piece.createBlackBishop(new Position(5, index)));
		rank.pieceAdd(Piece.createBlackKnight(new Position(6, index)));
		rank.pieceAdd(Piece.createBlackRook(new Position(7, index)));
		return rank;
	}

	public static Rank initializeWhitePawns(int index) {
		Rank rank = new Rank();
		for (int x = 0; x < 8; x++) {
			rank.pieceAdd(Piece.createWhitePawn(new Position(x, index)));
		}
		return rank;
	}

	public static Rank initializeBlackPawns(int index) {
		Rank rank = new Rank();
		for (int x = 0; x < 8; x++) {
			rank.pieceAdd(Piece.createBlackPawn(new Position(x, index)));
		}
		return rank;
	}

	public static Rank initializeBlank(int index) {
		Rank rank = new Rank();
		for (int x = 0; x < 8; x++) {
			rank.pieceAdd(Piece.createBlank(new Position(x, index)));
		}
		return rank;
	}

	public int pieceCount(Color color, Type type) {
		int count = 0;
		for (Piece piece : pieces) {
			if (piece.getColor() == color && piece.getType() == type) {
				count++;
			}
		}
		return count;
	}

	public Piece findPiece(int xPos) {
		return pieces.get(xPos);
	}

	public void move(int xPos, Piece piece) {
		pieces.set(xPos, piece);
	}

	public double caculcatePoint(Color color) {
		double point = 0;
		double checkPoint = 0;
		double countPawn = 0;
		for (Piece piece : pieces) {
			checkPoint = piece.getPoint(color);
			System.out.println(point);
			if (checkPoint == 1.0) {
				countPawn++;
			}
			point += checkPoint;
			// point += piece.getPoint(color);
		}
		return countPawn < 2 ? point : point - (countPawn * 0.5);
	}

}
