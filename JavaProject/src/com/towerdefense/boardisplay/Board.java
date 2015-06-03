package com.towerdefense.boardisplay;

public class Board {
	private final BoardFrame boardWindow;

	public Board(final int width, final int height, final BoardCell boardCases[][]) {
		this.boardWindow = new BoardFrame(width, height, boardCases);
	}

	public void placerPiece(final BoardPiece piece) {
		this.boardWindow.placePiece(piece);
	}

	public void rafraichir() {
		this.boardWindow.refresh();
	}
}
