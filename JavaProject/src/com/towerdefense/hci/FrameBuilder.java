package com.towerdefense.hci;

import java.awt.EventQueue;

import javax.swing.JFrame;

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
	}

}
