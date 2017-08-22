package chess;

import java.util.ArrayList;

import pieces.Pawn;

public class Board {
	private ArrayList<Pawn> whitePawns = new ArrayList<>();
	private ArrayList<Pawn> blackPawns = new ArrayList<>();

	public void initialize() {
		for (int i = 0; i < 8; i++) {
			addWhitePawn(new Pawn(Pawn.WHITE_COLOR, Pawn.WHITE_REPRESENTATION));
			addBlackPawn(new Pawn(Pawn.BLACK_COLOR, Pawn.BLACK_REPRESENTATION));
		}
	}

	public void addWhitePawn(Pawn pawn) {
		whitePawns.add(pawn);
	}

	public void addBlackPawn(Pawn pawn) {
		blackPawns.add(pawn);
	}

	public int size() {
		return whitePawns.size() + blackPawns.size();
	}

	public Pawn findWhitePawn(int index) {
		return whitePawns.get(index);
	}

	public Pawn findBlackPawn(int index) {
		return blackPawns.get(index);
	}

	public String getWhitePawnsResult() {
		return addRepresentation(whitePawns);
	}
	
	public String getBlackPawnsResult() {
		return addRepresentation(blackPawns);
	}
	
	private String addRepresentation(ArrayList<Pawn> pawns) {
		StringBuilder sb = new StringBuilder();
		for(Pawn pawn: pawns) {
			sb.append(pawn.getRepresentation());
		}
		return sb.toString();
	}
	
	void print() {
		System.out.println("........");
		System.out.println(getBlackPawnsResult());
		System.out.println("........");
		System.out.println("........");
		System.out.println("........");
		System.out.println("........");
		System.out.println(getWhitePawnsResult());
		System.out.println("........");
	}
}
