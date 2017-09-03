package chess;

import java.util.Scanner;

public class chessGame {
	public static void main(String[] args) {
		Board board = new Board();
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.println("start: 시작\nend: 종료");
			String command = scanner.nextLine();
			if (command.equals("end")) {
				break;
			}
			board.initialize();
			System.out.println(board.showBoard());
		}
	}
}
