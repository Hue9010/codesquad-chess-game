package pieces;

public class Pawn {

	public final static String WHITE_COLOR = "white";
	public final static String BLACK_COLOR = "black";
	public static final char WHITE_REPRESENTATION = 'p';
	public static final char BLACK_REPRESENTATION = 'P';
	private String name;
	private String color;
	char representation;
	
	Pawn(){
		color = WHITE_COLOR;
		this.representation = Pawn.WHITE_REPRESENTATION;
	}
	
	public Pawn(String color){
		this.color = color;
		this.representation = Pawn.WHITE_REPRESENTATION;
	}
	
	public Pawn(String color, char representation) {
		this.color = color;
		this.representation = representation;
	}

	public String getColor() {
		return color;
	}

	public char getRepresentation() {
		return representation;
	}
	
}
