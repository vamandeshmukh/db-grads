package com.db.solid.single.standard;

public class BoardPresenter {

	Board board;

	public BoardPresenter(Board board) {
		this.board = board;
	}

	public void displayBoard() {
		String formattedBoard = "";
		for (int i = 0; i < this.board.size * this.board.size; i++) {
			String border = "";
			if ((i + 1) % this.board.size == 0) {
				border += "\n";
			} else {
				border += " ";
			}
			formattedBoard += board.spots.get(i);
			formattedBoard += border;
		}
		System.out.println(formattedBoard);

	}

}
