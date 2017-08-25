package pieces;

import java.util.ArrayList;
import java.util.List;

public class Position {
	private int x;
	private int y;
	private static final int RANKSIZE = 8;

	public Position(String position) {
		x = position.charAt(0) - 'a' + 1;
		y = Character.getNumericValue(position.charAt(1));
	}

	public Position(int x, int y) {
		this.x = x + 1;
		this.y = y + 1;
	}

	public int getXIndex() {
		return x - 1;
	}

	public int getYIndex() {
		return y - 1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public List<Position> SameYPosition() {
		List<Position> positions = new ArrayList<>();
		for (int yPos = 1; yPos <= RANKSIZE; yPos++) {
			if (yPos != getY()) {
				positions.add(new Position(getXIndex(), yPos - 1));
			}
		}
		return positions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
