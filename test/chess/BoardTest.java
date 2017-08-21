package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.Pawn;

public class BoardTest {
	Board board;
	Pawn white;
	Pawn black;
	// @Test
	// public void create() throws Exception {
	// Board board = new Board();
	//
	// Pawn white = new Pawn(Pawn.WHITE_COLOR);
	// board.add(white);
	// assertEquals(1, board.size());
	// assertEquals(white, board.findPawn(0));
	//
	// Pawn black = new Pawn(Pawn.BLACK_COLOR);
	// board.add(black);
	// assertEquals(2, board.size());
	// assertEquals(black, board.findPawn(1));
	// }

	@Before
	public void setUp() {
		board = new Board();
	}

	@Test
	public void initialize() throws Exception {
		Pawn white = new Pawn(Pawn.WHITE_COLOR);
		for (int i = 0; i < 8; i++) {
			white = new Pawn(Pawn.WHITE_COLOR);
			black = new Pawn(Pawn.BLACK_COLOR);
			board.add(white);
			board.add(black);
		}
		assertEquals(16,board.size());
	}

	@Test
	public void print() throws Exception {

	}

}
