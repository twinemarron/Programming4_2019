package Lec10Samples;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec10Smp01 extends Frame implements ActionListener {

	private Button btnDialog = new Button("ダイアログを開く");
	private TextField textFrame = new TextField("", 30);

	private MyDialog dialog = new MyDialog(this, "ダイアログ", true);

	public Lec10Smp01 () {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		setTitle("ダイアログサンプル");
		setLayout(new FlowLayout());
		add(textFrame);
		add(btnDialog);
		btnDialog.addActionListener(this);
	}

	public static void main(String arg[]) {
		Lec10Smp01 lec10Smp01 = new Lec10Smp01();
		lec10Smp01.setSize(600, 400);
		lec10Smp01.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		dialog.setSize(200, 150);
		dialog.setVisible(true);

		textFrame.setText(dialog.getTextData());

	}

}
