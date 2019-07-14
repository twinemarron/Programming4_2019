package lec1001;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec1001Kadai extends Frame {

	private MyDialog dialog = new MyDialog(this, "円のサイズ", true);
	int shapeSize;

	public Lec1001Kadai() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			};
		});

		setTitle("図形を描く");
		dialog.setSize(300, 100);
		dialog.setVisible(true);
		shapeSize = dialog.getShapeSize();
		repaint();
	}

	public void paint(Graphics g) {
		int px = (this.getSize().width - shapeSize) / 2;
		int py = (this.getSize().height - shapeSize) / 2;
		g.drawOval(px, py, shapeSize, shapeSize);
	}

	public static void main(String args[]) {
		Lec1001Kadai lec1001Kadai = new Lec1001Kadai();
		lec1001Kadai.setSize(600, 600);
		lec1001Kadai.setVisible(true);
	}
}
