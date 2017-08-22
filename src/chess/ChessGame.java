package chess;

import java.util.Scanner;

public class ChessGame {
	public static void main(String[] string) {
		Scanner scanner = new Scanner(System.in);
		String command;
		Board board = new Board();
		
		while(true) {
			System.out.println("게임을 시작하실려면 start를 입력하세요.(종료: end)");
			command = scanner.nextLine();
			
			if(command.equals("start")) {
				board.initialize();
				board.print();
			}
			if(command.equals("end")) {
				break;
			}
		}
		
	}
	
}
