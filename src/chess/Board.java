package chess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import pieces.Position;

import static utils.StringUtils.*;

public class Board {
	private List<Rank> ranks = new ArrayList<Rank>();

	public void initializeEmpty() {

		for (int i = 0; i < 8; i++) {
			ranks.add(Rank.initializePieces(i, new BlankPiecesStrategy()));
		}
	}

	public void initialize() {
		ranks.add(Rank.initializePieces(0, new WhitePiecesStrategy()));
		ranks.add(Rank.initializePieces(1, new WhitePawnPiecesStrategy()));
		ranks.add(Rank.initializePieces(2, new BlankPiecesStrategy()));
		ranks.add(Rank.initializePieces(3, new BlankPiecesStrategy()));
		ranks.add(Rank.initializePieces(4, new BlankPiecesStrategy()));
		ranks.add(Rank.initializePieces(5, new BlankPiecesStrategy()));
		ranks.add(Rank.initializePieces(6, new BlackPawnPiecesStrategy()));
		ranks.add(Rank.initializePieces(7, new BlackPiecesStrategy()));
	}

	private String getPieceResult(Rank rank) {
		StringBuilder sb = new StringBuilder();
		for (Piece piece : rank.getPieces()) {
			sb.append(piece.getRepresentation());
		}
		return sb.toString();
	}

	public String showBoard() {
		StringBuilder sb = new StringBuilder();
		for (int i = ranks.size() - 1; i >= 0; i--) {
			sb.append(appendNewLine(getPieceResult(ranks.get(i))));
		}
		return sb.toString();
	}

	public Piece findPiece(String position) {
		Position p = new Position(position);
		return ranks.get(p.getYIndex()).findPiece(p.getXIndex());
	}

	public void move(String sourcePosition, String targetPosition) {
		Position sourceP = new Position(sourcePosition);
		Position targetP = new Position(targetPosition);
		Piece movePiece = findPiece(sourcePosition);

		ranks.get(targetP.getYIndex()).move(targetP.getXIndex(), movePiece);
		ranks.get(sourceP.getYIndex()).move(sourceP.getXIndex(), Piece.createBlank(sourceP));
		movePiece.move(targetP);
	}

	public double caculcatePoint(Color color) {
		List<Piece> pieces = findPieceByColor(color);
		double point = 0;
		for (Piece piece : pieces) {
			point += piece.getPoint(pieces);
		}
		return point;
	}

	private List<Piece> findPieceByColor(Color color) {
		List<Piece> pieces = new ArrayList<>();
		for (Rank rank : ranks) {
			pieces.addAll(rank.findPieceByColor(color));
		}
		return pieces;
	}

	public int countPieceByColorAndType(Color color, Type type) {
		int countOfPiece = 0;
		for (Rank rank : ranks) {
			countOfPiece += rank.countPieceByColorAndType(color, type);
		}
		return countOfPiece;
	}

	public List<Piece> sortByPointOfColor(Color color) {
		List<Piece> pieces = findPieceByColor(color);
		Collections.sort(pieces);
		for (Piece piece : pieces) {
			System.out.print(" " + piece.getRepresentation());
		}
		return pieces;
	}
}
