package pieces;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pieces.Piece.Color;
import pieces.Piece.Type;

public class PieceTest {

	@Test
	public void getRepresentationPerPiece() throws Exception {
		assertEquals('p', Piece.Type.PAWN.getWhiteRepresentation());
		assertEquals('P', Piece.Type.PAWN.getBlackRepresentation());
	}

	@Test
	public void create_piece() {
		verifyPiece(Piece.createWhitePawn(), Color.WHITE, Type.PAWN.getWhiteRepresentation());
		verifyPiece(Piece.createBlackPawn(), Color.BLACK, Type.PAWN.getBlackRepresentation());

		verifyPiece(Piece.createWhiteKnight(), Color.WHITE, Type.KNIGHT.getWhiteRepresentation());
		verifyPiece(Piece.createBlackKnight(), Color.BLACK, Type.KNIGHT.getBlackRepresentation());

		verifyPiece(Piece.createWhiteRook(), Color.WHITE, Type.ROOK.getWhiteRepresentation());
		verifyPiece(Piece.createBlackRook(), Color.BLACK, Type.ROOK.getBlackRepresentation());

		verifyPiece(Piece.createWhiteBishop(), Color.WHITE, Type.BISHOP.getWhiteRepresentation());
		verifyPiece(Piece.createBlackBishop(), Color.BLACK, Type.BISHOP.getBlackRepresentation());

		verifyPiece(Piece.createWhiteQueen(), Color.WHITE, Type.QUEEN.getWhiteRepresentation());
		verifyPiece(Piece.createBlackQueen(), Color.BLACK, Type.QUEEN.getBlackRepresentation());

		verifyPiece(Piece.createWhiteKing(), Color.WHITE, Type.KING.getWhiteRepresentation());
		verifyPiece(Piece.createBlackKing(), Color.BLACK, Type.KING.getBlackRepresentation());

	}

	private void verifyPiece(final Piece piece, Color color, final char representation) {
		assertEquals(color, piece.getColor());
		assertEquals(representation, piece.getRepresentation());
	}
}
