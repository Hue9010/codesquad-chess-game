package pieces;

public class Piece {

//	public final static String PAWN = "pawn";
	public final static String WHITE_COLOR = "white";
	public final static String BLACK_COLOR = "black";
	public static final char WHITE_PAWN_REPRESENTATION = 'p';
	public static final char BLACK_PAWN_REPRESENTATION = 'P';
	public static final char WHITE_KNIGHT_REPRESENTATION = 'n';
	public static final char BLACK_KNIGHT_REPRESENTATION = 'N';
	public static final char WHITE_ROOK_REPRESENTATION = 'r';
	public static final char BLACK_ROOK_REPRESENTATION = 'R';
	public static final char WHITE_BISHOP_REPRESENTATION = 'b';
	public static final char BLACK_BISHOP_REPRESENTATION = 'B';
	public static final char WHITE_QUEEN_REPRESENTATION = 'q';
	public static final char BLACK_QUEEN_REPRESENTATION = 'Q';
	public static final char WHITE_KING_REPRESENTATION = 'k';
	public static final char BLACK_KING_REPRESENTATION = 'K';
	
//	private String name;
	private String color;
	char representation;
	
	//pawn, knight, rook, bishop, queen, king
	
	Piece(){
		color = WHITE_COLOR;
		this.representation = Piece.WHITE_PAWN_REPRESENTATION;
	}
	
	public Piece(String color){
		this.color = color;
		this.representation = Piece.WHITE_PAWN_REPRESENTATION;
	}
	
	private Piece(String color, char representation) {
		this.color = color;
		this.representation = representation;
	}
	
//	private Piece(String name, String color, char representation) {
//		this.name = name;
//		this.color = color;
//		this.representation = representation;
//	}

	public String getColor() {
		return color;
	}

	public char getRepresentation() {
		return representation;
	}

	public static Piece createWhitePawn() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_PAWN_REPRESENTATION);
	}
	public static Piece createBlackPawn() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_PAWN_REPRESENTATION);
	}
	
	public static Piece createWhiteKnight() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_KNIGHT_REPRESENTATION);
	}
	public static Piece createBlackKnight() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_KNIGHT_REPRESENTATION);
	}
	
	public static Piece createWhiteRook() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_ROOK_REPRESENTATION);
	}
	public static Piece createBlackRook() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_ROOK_REPRESENTATION);
	}
	
	public static Piece createWhiteBishop() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_BISHOP_REPRESENTATION);
	}
	public static Piece createBlackBishop() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_BISHOP_REPRESENTATION);
	}
	
	public static Piece createWhiteQueen() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_QUEEN_REPRESENTATION);
	}
	public static Piece createBlackQueen() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_QUEEN_REPRESENTATION);
	}
	
	public static Piece createWhiteKing() {
		return new Piece(WHITE_COLOR ,Piece.WHITE_KING_REPRESENTATION);
	}
	public static Piece createBlackKing() {
		return new Piece(BLACK_COLOR ,Piece.BLACK_KING_REPRESENTATION);
	}
	
}
