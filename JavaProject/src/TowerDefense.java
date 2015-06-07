import javax.swing.SwingUtilities;

import com.towerdefense.hci.Frame;



public class TowerDefense {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			final Frame frame = new Frame();
		});

	}

}
