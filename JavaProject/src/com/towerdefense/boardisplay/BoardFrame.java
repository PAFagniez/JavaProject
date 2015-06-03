package com.towerdefense.boardisplay;

import javax.swing.JFrame;

class BoardFrame extends JFrame {
	private static final long serialVersionUID = -6563585351564617603L;
	private final BoardPanel boardPanel;

	public BoardFrame(final int width, final int height, final BoardCell BoardCell[][]) {
		setTitle("Mother Board Defense");
		this.setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.boardPanel = new BoardPanel(width, height, BoardCell);
		setContentPane(this.boardPanel);
		setVisible(true);
	}

	public void placePiece(final BoardPiece piece) {
		this.boardPanel.placePiece(piece);
	}

	public void refresh() {
		this.boardPanel.repaint();
	}
}
