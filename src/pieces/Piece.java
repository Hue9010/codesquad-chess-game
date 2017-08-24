
package pieces;

public class Piece {

	public enum Color {
		WHITE, BLACK, NOCOLOR;
	}

	public enum Type {
		PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'), QUEEN('q'), KING('k'), NO_PIECE('.');

		private char representation;

		Type(char representation) {
			this.representation = representation;
		}

		public char getWhiteRepresentation() {
			return representation;
		}

		public char getBlackRepresentation() {
			return Character.toUpperCase(representation);
		}
	}

	private Color color;
	private Type representation;
	private Position position;

	private Piece(Color color, Type representation, Position position) {
		this.color = color;
		this.representation = representation;
		this.position = position;
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
		return color == Color.WHITE;
	}

	public boolean isBlack() {
		return color == Color.BLACK;
	}

	public Type getType() {
		return representation;
	}

	public Color getColor() {
		return color;
	}

	public char getRepresentation() {
		return color == Color.WHITE ? representation.getWhiteRepresentation() : representation.getBlackRepresentation();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((representation == null) ? 0 : representation.hashCode());
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
		if (representation != other.representation)
			return false;
		return true;
	}
	
	

}
