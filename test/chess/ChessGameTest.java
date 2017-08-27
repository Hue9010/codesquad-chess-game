package chess;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ChessGameTest {

	@Test
	public void test() {
		String move = "move";
		Scanner scanner = new Scanner(System.in);
		String command = scanner.nextLine();
		String[] cmd = command.split(" ");
//		assertEquals(true, move.startsWith(cmd[0]));
		assertEquals(true, cmd[0].startsWith("move"));
		
	}

}
