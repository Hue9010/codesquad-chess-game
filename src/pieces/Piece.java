package pieces;

public class Piece {

	public enum Color {
		WHITE, BLACK, NOCOLOR;
	}

	public enum Type {
		PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'), QUEEN('q'), KING('k'), NO_PIECE(' ');

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
	char representation;

	private Piece(Color color, char representation) {
		this.color = color;
		this.representation = representation;
	}

	public Color getColor() {
		return color;
	}

	public char getRepresentation() {
		return representation;
	}

	public static Piece createWhitePawn() {
		return new Piece(Color.WHITE, Type.PAWN.getWhiteRepresentation());
	}

	public static Piece createBlackPawn() {
		return new Piece(Color.BLACK, Type.PAWN.getBlackRepresentation());
	}

	public static Piece createWhiteKnight() {
		return new Piece(Color.WHITE, Type.KNIGHT.getWhiteRepresentation());
	}

	public static Piece createBlackKnight() {
		return new Piece(Color.BLACK, Type.KNIGHT.getBlackRepresentation());
	}

	public static Piece createWhiteRook() {
		return new Piece(Color.WHITE, Type.ROOK.getWhiteRepresentation());
	}

	public static Piece createBlackRook() {
		return new Piece(Color.BLACK, Type.ROOK.getBlackRepresentation());
	}

	public static Piece createWhiteBishop() {
		return new Piece(Color.WHITE, Type.BISHOP.getWhiteRepresentation());
	}

	public static Piece createBlackBishop() {
		return new Piece(Color.BLACK, Type.BISHOP.getBlackRepresentation());
	}

	public static Piece createWhiteQueen() {
		return new Piece(Color.WHITE, Type.QUEEN.getWhiteRepresentation());
	}

	public static Piece createBlackQueen() {
		return new Piece(Color.BLACK, Type.QUEEN.getBlackRepresentation());
	}

	public static Piece createWhiteKing() {
		return new Piece(Color.WHITE, Type.KING.getWhiteRepresentation());
	}

	public static Piece createBlackKing() {
		return new Piece(Color.BLACK, Type.KING.getBlackRepresentation());
	}

}
