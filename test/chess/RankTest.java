package chess;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RankTest {
	private Rank rank;

	@Test
	public void createWhitePawns() throws Exception {
		rank = Rank.createWhitePawn();
		assertEquals("pppppppp\n", rank.show());
	}

	@Test
	public void createBlackPawns() throws Exception {
		rank = Rank.createBlackPawn();
		assertEquals("PPPPPPPP\n", rank.show());
	}

	@Test
	public void createBlackPieces() throws Exception {
		rank = Rank.createBlackPieces();
		assertEquals("RNBQKBNR\n", rank.show());
	}

	@Test
	public void createWhitePieces() throws Exception {
		rank = Rank.createWhitePieces();
		assertEquals("rnbqkbnr\n", rank.show());
	}

	@Test
	public void createBlank() throws Exception {
		rank = Rank.createBlank();
		assertEquals("........\n", rank.show());
	}
}
