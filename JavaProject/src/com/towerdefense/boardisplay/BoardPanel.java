package com.towerdefense.boardisplay;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

class BoardPanel extends JPanel {
	private static final long serialVersionUID = -3618605287900763008L;
	private final BoardCell boardCells[][];
	private final ArrayList<BoardPiece> pieces;
	private final int width;
	private final int height;

	public BoardPanel(final int width, final int height, final BoardCell boardCells[][]) {
		this.width = width;
		this.height = height;
		this.boardCells = boardCells;
		this.pieces = new ArrayList<>();
	}

	@Override
	public void paintComponent(final Graphics g) {
		final int sizeWidth = getWidth() / this.width;
		final int sizeHeight = getHeight() / this.height;

		for (int i = 0; i < this.width; i++) {
			for (int j = 0; j < this.height; j++) {
				g.drawImage(this.boardCells[i][j].getImage(), sizeWidth * i, sizeHeight
						* j, sizeWidth, sizeHeight, this);
			}
		}

		for (final BoardPiece piece : this.pieces) {
			g.drawImage(piece.getImage(), sizeWidth * piece.getHorizontalPosition(),
					sizeHeight * piece.getVerticalPosition(), sizeWidth, sizeHeight,
					this);
		}
	}

	public void placePiece(final BoardPiece piece) {
		this.pieces.add(piece);
	}

}
