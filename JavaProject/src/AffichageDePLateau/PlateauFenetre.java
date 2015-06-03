package AffichageDePlateau;

import javax.swing.JFrame;

class PlateauFenetre extends JFrame {
	private static final long serialVersionUID = -6563585351564617603L;
	private final PlateauPanneau plateauPanneau;

	public PlateauFenetre(final int largeur, final int hauteur, final PlateauCase plateauCases[][]) {
		setTitle("Mother Board Defense");
		this.setSize(700, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.plateauPanneau = new PlateauPanneau(largeur, hauteur, plateauCases);
		setContentPane(this.plateauPanneau);
		setVisible(true);
	}

	public void placerPiece(final PlateauPiece piece) {
		this.plateauPanneau.placerPiece(piece);
	}

	public void rafraichir() {
		this.plateauPanneau.repaint();
	}
}
