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
	public void caculcatePoint() throws Exception {
		board.initializeEmpty();

		addPiece("b6", Piece.createBlackPawn(new Position("b6")));
		addPiece("e6", Piece.createBlackQueen(new Position("e6")));
		addPiece("b8", Piece.createBlackKing(new Position("b8")));
		addPiece("c8", Piece.createBlackRook(new Position("c8")));

		addPiece("f2", Piece.createWhitePawn(new Position("f2")));
		addPiece("g2", Piece.createWhitePawn(new Position("g2")));
		addPiece("e1", Piece.createWhiteRook(new Position("e1")));
		addPiece("f1", Piece.createWhiteKing(new Position("f1")));

		assertEquals(15.0, board.caculcatePoint(Color.BLACK), 0.01);
		assertEquals(6.0, board.caculcatePoint(Color.WHITE), 0.01);

		System.out.println(board.showBoard());
	}

	private void addPiece(String position, Piece piece) {
		board.move(position, piece);
	}

	// @Test
	// public void create() throws Exception {
	// board.initialize();
	// assertEquals(8, board.pieceCount(Color.BLACK, Type.PAWN));
	// String blankRank = appendNewLine("........");
	// assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") +
	// blankRank + blankRank + blankRank
	// + blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"),
	// board.showBoard());
	// }
}
