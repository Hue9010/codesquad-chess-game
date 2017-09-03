
package pieces;

import java.util.List;

public class Piece implements Comparable<Piece> {

	public enum Color {
		WHITE, BLACK, NOCOLOR;
		String s;
	}

	public enum Type {
		PAWN('p', 1.0), ROOK('r', 5.0), KNIGHT('n', 2.5), BISHOP('b', 3.0), QUEEN('q', 9.0), KING('k',
				0.0), NO_PIECE('.', 0.0);

		private char representation;
		private double point;

		Type(char representation, double point) {
			this.representation = representation;
			this.point = point;
		}

		public double getPoint() {
			return point;
		}

		public char getWhiteRepresentation() {
			return representation;
		}

		public char getBlackRepresentation() {
			return Character.toUpperCase(representation);
		}
	}

	private Color color;
	private Type type;
	private Position position;

	private Piece(Color color, Type representation, Position position) {
		this.color = color;
		this.type = representation;
		this.position = position;
	}

	public boolean move(Position targetPosition) {
		if (type.getWhiteRepresentation() == 'k') {
			if (moveKing(targetPosition)) {
				return true;
			}
			return false;
		}
		if(type.getWhiteRepresentation() == 'q') {
			if(moveQueen(targetPosition)) {
				return true;
			}
			return false;
		}
		return false;
	}

	private boolean moveQueen(Position targetPosition) {
		int targetX = targetPosition.getX();
		int targetY = targetPosition.getY();
		int thisX = position.getX();
		int thisY = position.getY();
		if (targetPosition.equals(position)) {
			return false;
		}
		if(targetX - thisX == 0) {
			if(targetY > thisY) {
				
			}
		}
		return false;
	}

	private boolean moveKing(Position targetPosition) {
		int targetX = targetPosition.getX();
		int targetY = targetPosition.getY();
		int thisX = position.getX();
		int thisY = position.getY();
		if (targetPosition.equals(position)) {
			return false;
		}
		if (targetX > 7 || targetX < 1) {
			return false;
		}
		if (targetY > 7 || targetY < 1) {
			return false;
		}
		if (Math.abs((thisY - targetY)) > 1) {
			return false;
		}
		if (Math.abs((thisX - targetX)) > 1) {
			return false;
		}
		this.position = targetPosition;
		return true;
	}

	public double getPoint(List<Piece> pieces) {
		if (this.type != Type.PAWN) {
			return type.getPoint();
		}
		for (Position pos : this.position.SameYPosition()) {
			if (pieces.contains(new Piece(this.color, this.type, pos))) {
				return type.getPoint() - 0.5;
			}
		}
		return type.point;
	}

	private static Piece creatWhite(Type representation, Position position) {
		return new Piece(Color.WHITE, representation, position);
	}

	private static Piece creatBlack(Type representation, Position position) {
		return new Piece(Color.BLACK, representation, position);
	}

	public static Piece createWhitePawn(Position position) {
		return creatWhite(Type.PAWN, position);
	}

	public static Piece createBlackPawn(Position position) {
		return creatBlack(Type.PAWN, position);
	}

	public static Piece createWhiteKnight(Position position) {
		return creatWhite(Type.KNIGHT, position);
	}

	public static Piece createBlackKnight(Position position) {
		return creatBlack(Type.KNIGHT, position);
	}

	public static Piece createWhiteRook(Position position) {
		return creatWhite(Type.ROOK, position);
	}

	public static Piece createBlackRook(Position position) {
		return creatBlack(Type.ROOK, position);
	}

	public static Piece createWhiteBishop(Position position) {
		return creatWhite(Type.BISHOP, position);
	}

	public static Piece createBlackBishop(Position position) {
		return creatBlack(Type.BISHOP, position);
	}

	public static Piece createWhiteQueen(Position position) {
		return creatWhite(Type.QUEEN, position);
	}

	public static Piece createBlackQueen(Position position) {
		return creatBlack(Type.QUEEN, position);
	}

	public static Piece createWhiteKing(Position position) {
		return creatWhite(Type.KING, position);
	}

	public static Piece createBlackKing(Position position) {
		return creatBlack(Type.KING, position);
	}

	public static Piece createBlank(Position position) {
		return new Piece(Color.NOCOLOR, Type.NO_PIECE, position);
	}

	public boolean isWhite() {
		return checkColor(Color.WHITE);
	}

	public boolean isBlack() {
		return checkColor(Color.BLACK);
	}

	private boolean checkColor(Color color) {
		return this.color == color;
	}

	public Type getType() {
		return type;
	}

	public Color getColor() {
		return color;
	}

	public char getRepresentation() {
		return checkColor(Color.WHITE) ? type.getWhiteRepresentation() : type.getBlackRepresentation();
	}

	public void addPiecesByColor(Color color, List<Piece> piecesByColor) {
		if (checkColor(color)) {
			piecesByColor.add(this);
		}
	}

	public boolean checkColorType(Color color, Type type) {
		return this.color == color && this.type == type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color != other.color)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public int compareTo(Piece piece) {
		// return (int) (type.getPoint() * 2 - piece.type.getPoint() * 2); //오름 차순으로
		// 정렬하고 싶다면 주석 해제
		return (int) (piece.type.getPoint() * 2 - type.getPoint() * 2);
	}

}
