package pieces;

public class InvalidMovePositionException extends RuntimeException{

	public InvalidMovePositionException() {
		super();
	}

	public InvalidMovePositionException(String message) {
		super(message);
	}

}
