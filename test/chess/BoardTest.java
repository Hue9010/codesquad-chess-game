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
    public void findPiece() throws Exception {
        board.initialize();

        assertEquals(Piece.createBlackRook(new Position("a8")), board.findPiece("a8"));
        assertEquals(Piece.createBlackRook(new Position("h8")), board.findPiece("h8"));
        assertEquals(Piece.createWhiteRook(new Position("a1")), board.findPiece("a1"));
        assertEquals(Piece.createWhiteRook(new Position("h1")), board.findPiece("h1"));
    }
	@Test
	public void create() throws Exception {
		board.initialize();
		assertEquals(8, board.pieceCount(Color.BLACK, Type.PAWN));
		String blankRank = appendNewLine("........");
		assertEquals(appendNewLine("RNBQKBNR") + appendNewLine("PPPPPPPP") + blankRank + blankRank + blankRank
				+ blankRank + appendNewLine("pppppppp") + appendNewLine("rnbqkbnr"), board.showBoard());
	}
}
