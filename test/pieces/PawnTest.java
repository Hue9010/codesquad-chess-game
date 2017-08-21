package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

public class PawnTest {
	
	final static String WHITE = "white";
	final static String BLACK = "black";

	@Test
    public void create() {
        verifyPawn(WHITE);
        verifyPawn(BLACK);
    }

	@Test
	public void create_기본생성자() {
		Pawn pawn = new Pawn();
        assertEquals(WHITE, pawn.getColor());
	}
	
    void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertEquals(color, pawn.getColor());
    }
    
    
}
