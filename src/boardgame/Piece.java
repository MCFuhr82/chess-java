package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //informado apenas para fins did�ticos. N�o � necess�rio informar se for null.
	}

	protected Board getBoard() {
		return board;
	}
}
