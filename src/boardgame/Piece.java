package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	//constructor
	public Piece(Board board) {
		this.board = board;
	}
	//getters and setters
	protected Board getBoard() {
		return board;
	}

	
	
}
