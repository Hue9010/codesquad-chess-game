package chess;

import java.util.Scanner;

public class ChessMain {
	public static void main(String[] string) {
		Scanner scanner = new Scanner(System.in);
		String command;
		String[] cmd;

		while (true) {
			System.out.println("게임을 시작하실려면 start를 입력하세요.(종료: end)");
			command = scanner.nextLine();

			if (command.equals("start")) {
				Board board = new Board();
				board.initialize();
				System.out.println(board.showBoard());

				System.out.println("이동할 말의 위치와 이동 하실 위치를 입력해 주세요.\nex)move a1 a2");
				command = scanner.nextLine();
				cmd = command.split(" ");
				if (cmd[0].startsWith("move")) {
					board.move(cmd[1], cmd[2]);
					System.out.println(board.showBoard());
					System.out.println("");
				}

			}
			if (command.equals("end")) {
				break;
			}
		}

		scanner.close();
	}
}
