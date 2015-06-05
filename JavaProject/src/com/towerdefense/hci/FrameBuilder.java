package com.towerdefense.hci;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				final FrameBuilder window = new FrameBuilder();
				window.frame.setVisible(true);
			} catch (final Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public FrameBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.frame = new JFrame();

		final JPanel panel = new JPanel();
		this.frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));

		final JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel.add(panel_2, "name_624870951258280");

		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.RED);
		panel.add(panel_1, "name_624823032214164");
	}

}
