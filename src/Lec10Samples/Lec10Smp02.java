package Lec10Samples;

import java.awt.Button;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec10Smp02 extends Frame implements ActionListener {

	private Button fileBtn = new Button("ファイルを開く");
	private Label pathname = new Label("パス : ");
	private Label filename = new Label("ファイル : ");


	public Lec10Smp02 () {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});

		setTitle("ファイルダイアログを使う");

		setLayout(new FlowLayout());

		add(pathname);
		add(filename);
		add(fileBtn);

		fileBtn.addActionListener(this);

	}

	public static void main(String args[]) {
		Lec10Smp02 lec10Smp02 = new Lec10Smp02();
		lec10Smp02.setSize(600, 400);
		lec10Smp02.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		FileDialog fdialog = new FileDialog(this, "ファイルを開く", FileDialog.LOAD);
		fdialog.setVisible(true);
		pathname.setText("パス : " + fdialog.getDirectory());
		filename.setText("ファイル : " + fdialog.getFile());

	}



}
