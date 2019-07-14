package lec0801;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec0801Kadai extends Frame {

	public static void main (String args[]) {
		Lec0801Kadai fm01 = new Lec0801Kadai();
		fm01.setSize(600, 200);
		fm01.setVisible(true);
	}

	public Lec0801Kadai() {
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					System.exit(0);
				}
			}
		);
		setTitle("Test");
	}

	public void paint(Graphics g) {
		g.drawLine(30, 100, 400, 100);
		g.setColor(Color.RED);
		g.fillOval(50, 50, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(150, 50, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(250, 50, 100, 100);
	}

}
