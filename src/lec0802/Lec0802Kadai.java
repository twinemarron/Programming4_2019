package lec0802;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec0802Kadai extends Frame implements ActionListener {

	private TextField tf1 = new TextField("", 6);
	private TextField tf2 = new TextField("", 4);

	public static void main() {

		Lec0802Kadai fm02 = new Lec0802Kadai();
		fm02.setSize(800, 200);
		fm02.setVisible(true);
	}

	public Lec0802Kadai() {
		setLayout(new FlowLayout(FlowLayout.CENTER));

		add(tf1);
		add(tf2);

		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					System.exit(0);
				}
			}
		);
		setTitle("Test");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

//	public void paint(Graphics g) {
//
//	}
}
