package chess;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterTest {

	@Test
	public void test() {
		assertTrue(Character.isWhitespace('\n'));
		assertTrue(Character.isWhitespace('\t'));
		assertFalse(Character.isWhitespace('/'));
		assertFalse(Character.isWhitespace('^'));
		}

}
