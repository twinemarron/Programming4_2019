package lec1001;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDialog extends Dialog implements ActionListener {

	private Button btnOK = new Button("OK");
	private Button btnCancel = new Button("Cancel");
	private TextField tf = new TextField("", 6);
	private int shapeSize = 100;

	public MyDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO 自動生成されたコンストラクター・スタブ
		setLayout(new FlowLayout());
		add(tf);
		add(btnOK);
		add(btnCancel);
		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);
	}

	public int getShapeSize () {
		return shapeSize;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getSource() == btnOK) {
			shapeSize = Integer.parseInt(tf.getText());
			setVisible(false);
		} else if (e.getSource() == btnCancel) {
			setVisible(false);
		}
		setVisible(false);
	}

}
