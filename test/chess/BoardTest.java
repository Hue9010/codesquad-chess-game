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
	public void move() throws Exception {
		board.initializeEmpty();

		String position = "b5";
		Piece piece = Piece.createBlackRook(new Position(position));
		board.move(position, piece);

		assertEquals(piece, board.findPiece(position));
		System.out.println(board.showBoard());
	}

	@Test
	public void caculcatePoint() throws Exception {
		board.initializeEmpty();

		addPiece("b6", Piece.createBlackPawn(new Position("b6")));
		addPiece("e6", Piece.createBlackQueen(new Position("e6")));
		addPiece("b8", Piece.createBlackKing(new Position("b8")));
		addPiece("c8", Piece.createBlackRook(new Position("c8")));

		addPiece("f2", Piece.createWhitePawn(new Position("f2")));
		addPiece("d3", Piece.createWhitePawn(new Position("d3")));
		addPiece("f4", Piece.createWhitePawn(new Position("f4")));
		addPiece("e1", Piece.createWhiteRook(new Position("e1")));
		addPiece("f1", Piece.createWhiteKing(new Position("f1")));

		assertEquals(15.0, board.caculcatePoint(Color.BLACK), 0.01);
		assertEquals(7.0, board.caculcatePoint(Color.WHITE), 0.01);

		System.out.println(board.showBoard());
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

	private void addPiece(String position, Piece piece) {
		board.move(position, piece);
	}
	
	@Test
	public void sortByPointOfColorTest() throws Exception {
		board.initialize();
		System.out.println("정렬");
		board.sortByPointOfColor(Color.WHITE);
		
	}

}
