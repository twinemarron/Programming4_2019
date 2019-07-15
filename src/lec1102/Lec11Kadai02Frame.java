package lec1102;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lec11Kadai02Frame extends Frame {

	private String str;

	public Lec11Kadai02Frame() {

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("第11回授業の課題2");
		setLayout(new FlowLayout());

		try {
			BufferedReader br = new BufferedReader(new FileReader("Lec11Kadai01Write.txt"));
			str = br.readLine();
			br.close();
		} catch (IOException err) {
			str = "入出力エラーです。";
		} finally {
			Label label = new Label(str);
			add(label);
		}
	}
}
