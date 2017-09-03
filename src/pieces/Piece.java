package pieces;

public class Piece {
	
	public enum Color{
		WHITE, BLACK, NONCOLOR;
	}
	
	public enum Type{
		PAWN('p'), KNIGHT('n'), ROOK('r'), BISHOP('b'), QUEEN('q'), KING('k'), BLANK('.');
		
		private char representation;
		
		Type(char representation){
			this.representation = representation;
		}

		public char getRepresentation() {
			return representation;
		}
		
		public char getWhiteRepresentation() {
			return representation;
		}
		
		public char getBlackRepresentation() {
			return Character.toUpperCase(representation);
		}
		
	}
	
	Color color;
	Type type;

	private Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
	}

	public Color getColor() {
		return color;
	}
	
	private boolean isBlack(Color color) {
		return Color.BLACK == color;
	}

	public char getRerepresentation() {
		return isBlack(color)? type.getBlackRepresentation() : type.getWhiteRepresentation();
	}

	public static Piece createWhitePawn() {
		return new Piece(Color.WHITE, Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return new Piece(Color.BLACK, Type.PAWN);
	}

	public static Piece createKnight(Color color) {
		return new Piece(color, Type.KNIGHT);
	}
	
	public static Piece createBishop(Color color) {
		return new Piece(color, Type.BISHOP);
	}
	
	public static Piece createRook(Color color) {
		return new Piece(color, Type.ROOK);
	}
	
	public static Piece createKing(Color color) {
		return new Piece(color, Type.KING);
	}
	
	public static Piece createQueen(Color color) {
		return new Piece(color, Type.QUEEN);
	}
	
	public static Piece createBlank() {
		return new Piece(Color.NONCOLOR, Type.BLANK);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Piece [color=" + getColor() + ", type=" + getRerepresentation() + "]";
	}
	
}
