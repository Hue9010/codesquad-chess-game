package pieces;

import static org.junit.Assert.*;

import org.junit.Test;

import pieces.Piece.Color;
import pieces.Piece.Type;

public class PieceTest {
	

    private void verifyPiece(final Piece whitePiece, final Piece blackPiece, final Type type) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());

        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
    }

	@Test
	public void getRepresentationPerPiece() throws Exception {
		assertEquals('p', Piece.Type.PAWN.getWhiteRepresentation());
		assertEquals('P', Piece.Type.PAWN.getBlackRepresentation());
	}

	
//해당 메소드를 public으로 하였을땐 정상 작
//	@Test
//	public void moveKing() throws Exception {
//		Piece king = Piece.createBlackKing(new Position("e8"));
//		assertEquals(true, king.moveKing(new Position("d8")));
//		assertEquals(true, king.moveKing(new Position("f8")));
//		assertEquals(true, king.moveKing(new Position("e7")));
//		assertEquals(true, king.moveKing(new Position("d7")));
//		assertEquals(true, king.moveKing(new Position("f7")));
//		assertEquals(false, king.moveKing(new Position("e9")));
//		assertEquals(false, king.moveKing(new Position("d9")));
//		assertEquals(false, king.moveKing(new Position("f9")));
//		assertEquals(false, king.moveKing(new Position("e8")));
//
//		assertEquals(false, king.moveKing(new Position("d6")));
//		assertEquals(false, king.moveKing(new Position("f3")));
//		assertEquals(false, king.moveKing(new Position("a1")));
//		assertEquals(false, king.moveKing(new Position("c7")));
//	}
	
}
