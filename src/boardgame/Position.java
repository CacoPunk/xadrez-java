package boardgame;

public class Position {
	private int row;
	private int column;
	
	//constructor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//methods
	public void setValues(int row, int column) {
		
	}

	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	//getters and setters
	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getComumn() {
		return column;
	}


	public void setComumn(int column) {
		this.column = column;
	}
	
	
	
	
}
