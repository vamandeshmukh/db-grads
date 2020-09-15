package com.db.solid.single.standard;

import java.util.ArrayList;

public class App {
	
	public static void main(String[] args) {
		int size = 3;
		ArrayList<String> spots = new ArrayList<String>();
		spots.add("5");
		spots.add("2");
		spots.add("6");
		spots.add("7");
		spots.add("9");
		spots.add("3");
		spots.add("8");
		spots.add("1");
		spots.add("4");
		Board board = new Board(size, spots);
		
		BoardShaper boardShaper = new BoardShaper(size);
		BoardPresenter boardPresenter = new BoardPresenter(board);

		System.out.println(boardShaper.rowIndexes());
		boardPresenter.displayBoard();
		
	}

}
