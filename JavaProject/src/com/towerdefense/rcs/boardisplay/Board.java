package com.towerdefense.rcs.boardisplay;

public class Board {
	private final BoardFrame boardFrame;

	public Board(final int width, final int height, final BoardCell boardCells[][]) {
		this.boardFrame = new BoardFrame(width, height, boardCells);
	}

	public void placePiece(final BoardPiece piece) {
		this.boardFrame.placePiece(piece);
	}

	public void refresh() {
		this.boardFrame.refresh();
	}
}
