package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.Piece;
import pieces.Piece.Color;

import static utils.StringUtils.*;

public class BoardTest {
	private Board board;

	@Before
	public void settup() {
		board = new Board();
	}

	@Test
	public void initializeTest() throws Exception {
		board.initialize();
		assertEquals(8, board.ranks.size());
	}
	
	@Test
	public void initializeEmptyTest() throws Exception {
		board.initializeEmpty();
		System.out.println(board.showBoard());
	}

	@Test
	public void showTest() throws Exception {
		board.initialize();
		System.out.println(board.showBoard());
		String blankRank = appendNewLine("........");
		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());
	}

	@Test
	public void findPiece() throws Exception {
		board.initialize();

		System.out.println(board.findPiece("a8"));
		assertEquals(Piece.createRook(Color.BLACK), board.findPiece("a8"));
		assertEquals(Piece.createRook(Color.BLACK), board.findPiece("h8"));
		assertEquals(Piece.createRook(Color.WHITE), board.findPiece("a1"));
		assertEquals(Piece.createRook(Color.WHITE), board.findPiece("h1"));
	}
}
