package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import pieces.Piece.Color;

public class PieceTest {
	@Test
    public void createWhitePawn() {
        Piece whitePawn = Piece.createWhitePawn();
        assertEquals(Color.WHITE,whitePawn.getColor());
        assertEquals('p',whitePawn.getRerepresentation());
    }
	
	@Test
	public void createBlackPawn() throws Exception {
		Piece blackPawn = Piece.createBlackPawn();
        assertEquals(Color.BLACK,blackPawn.getColor());
        assertEquals('P',blackPawn.getRerepresentation());
	}
	
	@Test
	public void createWhiteKnight() throws Exception {
		Piece whiteKnight = Piece.createKnight(Color.WHITE);
        assertEquals(Color.WHITE,whiteKnight.getColor());
        assertEquals('n',whiteKnight.getRerepresentation());
	}
	
	@Test
	public void createWhiteKing() throws Exception {
		Piece whiteKing = Piece.createKing(Color.WHITE);
        assertEquals(Color.WHITE,whiteKing.getColor());
        assertEquals('k',whiteKing.getRerepresentation());
	}
	
	@Test
	public void createWhiteQueen() throws Exception {
		Piece whiteQueen = Piece.createQueen(Color.WHITE);
        assertEquals(Color.WHITE,whiteQueen.getColor());
        assertEquals('q',whiteQueen.getRerepresentation());
	}
	
	@Test
	public void createBlackRook() throws Exception {
		Piece blackRook = Piece.createRook(Color.BLACK);
        assertEquals(Color.BLACK,blackRook.getColor());
        assertEquals('R',blackRook.getRerepresentation());
	}
	
	@Test
	public void createBlackBishop() throws Exception {
		Piece blackBishop = Piece.createBishop(Color.BLACK);
        assertEquals(Color.BLACK,blackBishop.getColor());
        assertEquals('B',blackBishop.getRerepresentation());
	}
	
	@Test
	public void createBlank() throws Exception {
		Piece blank = Piece.createBlank();
        assertEquals(Color.NONCOLOR,blank.getColor());
        assertEquals('.',blank.getRerepresentation());
	}
	
}
