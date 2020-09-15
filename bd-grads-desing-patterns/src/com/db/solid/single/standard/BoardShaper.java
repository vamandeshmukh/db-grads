package com.db.solid.single.standard;

import java.util.ArrayList;

public class BoardShaper {

	int size;

	public BoardShaper(int size) {
		this.size = size;
	}

	public ArrayList<ArrayList<Integer>> rowIndexes() {
		ArrayList<ArrayList<Integer>> rows = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < this.size; i++) {
			ArrayList<Integer> row = new ArrayList<Integer>();
			for (int j = 0; j < this.size; j++) {
				row.add((i * size) + (j));
			}
			rows.add(row);
		}
		return rows;
	}

}
