package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.Piece;
import pieces.Piece.Color;
import pieces.Piece.Type;
import pieces.Position;

import static utils.StringUtils.*;

public class BoardTest {
	private Board board;

	@Before
	public void setup() {
		board = new Board();
	}

	@Test
	public void move() throws Exception {
		board.initializeEmpty();

		String position = "b5";
		Piece piece = Piece.createBlackRook(new Position("a8"));
		board.move(position, piece);

		assertEquals(piece, board.findPiece(position));
		System.out.println(board.showBoard());
	}

//	@Test
//	public void create() throws Exception {
//		board.initialize();
//		assertEquals(8, board.pieceCount(Color.BLACK, Type.PAWN));
//		String blankRank = appendNewLine("........");
//		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
//				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());
//	}
}
