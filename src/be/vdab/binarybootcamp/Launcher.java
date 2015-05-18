package be.vdab.binarybootcamp;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Launcher {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		MyFrame f = new MyFrame();
		j.setBounds(500,500,500,500);
		j.setVisible(true);
		j.paint(g);
	}

}
