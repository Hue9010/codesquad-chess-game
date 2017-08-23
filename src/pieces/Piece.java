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
	Type representation;

	private Piece(Color color, Type representation) {
		this.color = color;
		this.representation = representation;
	}

	private static Piece creatWhite(Type representation) {
		return new Piece(Color.WHITE, representation);
	}

	private static Piece creatBlack(Type representation) {
		return new Piece(Color.BLACK, representation);
	}

	public static Piece createWhitePawn() {
		return creatWhite(Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return creatBlack(Type.PAWN);
	}

	public static Piece createWhiteKnight() {
		return creatWhite(Type.KNIGHT);
	}

	public static Piece createBlackKnight() {
		return creatBlack(Type.KNIGHT);
	}

	public static Piece createWhiteRook() {
		return creatWhite(Type.ROOK);
	}

	public static Piece createBlackRook() {
		return creatBlack(Type.ROOK);
	}

	public static Piece createWhiteBishop() {
		return creatWhite(Type.BISHOP);
	}

	public static Piece createBlackBishop() {
		return creatBlack(Type.BISHOP);
	}

	public static Piece createWhiteQueen() {
		return creatWhite(Type.QUEEN);
	}

	public static Piece createBlackQueen() {
		return creatBlack(Type.QUEEN);
	}

	public static Piece createWhiteKing() {
		return creatWhite(Type.KING);
	}

	public static Piece createBlackKing() {
		return creatBlack(Type.KING);
	}

	public static Piece createBlank() {
		return new Piece(Color.NOCOLOR, Type.NO_PIECE);
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

}
