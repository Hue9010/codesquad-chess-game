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
	public void create() throws Exception {
		board.initialize();
		String blankRank = appendNewLine("........");
		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());
	}

	@Test
	public void print() throws Exception {
		board.initialize();
		System.out.println(board.showBoard());
	}

	@Test
	public void findPiece() throws Exception {
		board.initialize();

		assertEquals(Piece.createBlackRook(new Position("a8")), board.findPiece("a8"));
		assertEquals(Piece.createBlackRook(new Position("h8")), board.findPiece("h8"));
		assertEquals(Piece.createWhiteRook(new Position("a1")), board.findPiece("a1"));
		assertEquals(Piece.createWhiteRook(new Position("h1")), board.findPiece("h1"));
	}

	@Test
	public void countPieceByColorAndTypeTest() throws Exception {
		board.initialize();

		assertEquals(8, board.countPieceByColorAndType(Color.WHITE, Type.PAWN));
		assertEquals(2, board.countPieceByColorAndType(Color.BLACK, Type.KNIGHT));
		assertEquals(2, board.countPieceByColorAndType(Color.WHITE, Type.KNIGHT));
		assertEquals(1, board.countPieceByColorAndType(Color.BLACK, Type.QUEEN));
		assertEquals(1, board.countPieceByColorAndType(Color.WHITE, Type.KING));
	}

	@Test
	public void sortByPointOfColorTest() throws Exception {
		board.initialize();
		System.out.println("정렬");
		board.sortByPointOfColor(Color.WHITE);

	}

	@Test
	public void moveTest() throws Exception {
		board.initialize();

		String sourcePosition = "b2";
		String targetPosition = "b3";
		board.move(sourcePosition, targetPosition);
		assertEquals(Piece.createBlank(new Position(sourcePosition)), board.findPiece(sourcePosition));
		assertEquals(Piece.createWhitePawn(new Position(targetPosition)), board.findPiece(targetPosition));
		System.out.println("이동");
		System.out.println(board.showBoard());
	}
	
	@Test
	public void createBlankBoardTest() throws Exception {
		board.initializeEmpty();
		System.out.println(board.showBoard());
	}

}
