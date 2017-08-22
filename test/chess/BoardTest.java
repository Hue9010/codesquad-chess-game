package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.Pawn;
import utils.StringUtils;

import static utils.StringUtils.*;

public class BoardTest {
	Board board;
	Pawn white;
	Pawn black;

	@Before
	public void setUp() {
		board = new Board();
	}

	@Test
	public void create() throws Exception {
		Pawn white = new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION);
		board.addWhitePawn(white);
		assertEquals(1, board.size());
		assertEquals(white, board.findWhitePawn(0));

		Pawn black = new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION);
		board.addBlackPawn(black);
		assertEquals(2, board.size());
		assertEquals(black, board.findBlackPawn(0));
	}

	@Test
	public void initialize() throws Exception {
		board = new Board();
		board.initialize();
		assertEquals("PPPPPPPP", board.getBlackPawnsResult());
		assertEquals("pppppppp", board.getWhitePawnsResult());
	}

	@Test
	public void print() throws Exception {
		board = new Board();
		board.initialize();
		board.print();
		System.out.println(StringUtils.appendNewLine("3333"));
	}
}
