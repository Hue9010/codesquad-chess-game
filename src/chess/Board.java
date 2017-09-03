package chess;

import java.util.ArrayList;
import java.util.List;

import pieces.Piece;

public class Board {
	List<Rank> ranks;

	public void initialize() {
		ranks = new ArrayList<>();
		ranks.add(Rank.createWhitePieces());
		ranks.add(Rank.createWhitePawn());
		ranks.add(Rank.createBlank());
		ranks.add(Rank.createBlank());
		ranks.add(Rank.createBlank());
		ranks.add(Rank.createBlank());
		ranks.add(Rank.createBlackPawn());
		ranks.add(Rank.createBlackPieces());
	}
	
	public void initializeEmpty() {
		ranks = new ArrayList<>();
		for(int i=0; i < 8; i++) {
			ranks.add(Rank.createBlank());
		}
	}

	public String showBoard() {
		StringBuilder sb = new StringBuilder();
		for (Rank rank : ranks) {
			sb.insert(0, rank.show());
		}
		return sb.toString();
	}

	public Piece findPiece(String position) {
		int x = position.charAt(0) - 'a';
		int y = Character.getNumericValue(position.charAt(1)) - 1;
		Rank rank = ranks.get(y);
		return rank.getPiece(x);
	}

}
