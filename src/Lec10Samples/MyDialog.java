package Lec10Samples;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyDialog extends Dialog implements ActionListener {

	private Button btnOK = new Button("OK");
	private Button btnCancel = new Button("キャンセル");
	private TextField textDialog = new TextField("", 20);

	private String msg = new String("");

	public MyDialog(Frame parent, String title, boolean modals) {
		super(parent, title, modals);
		// TODO 自動生成されたコンストラクター・スタブ
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				setVisible(false);
			};
		});

		setLayout(new FlowLayout());
		add(new Label("データ入力"));
		add(textDialog);
		add(btnOK);
		add(btnCancel);

		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	public String getTextData() {
		// TODO 自動生成されたメソッド・スタブ
		return msg;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getSource() == btnOK) {
			msg = textDialog.getText();
			textDialog.setText("");
			setVisible(false);
		}
		else if (e.getSource() == btnCancel) {
			setVisible(false);
		}
	}

}
