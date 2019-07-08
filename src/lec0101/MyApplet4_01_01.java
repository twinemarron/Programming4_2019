package lec0101;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lec0101Util.MyTime;

public class MyApplet4_01_01 extends Applet implements ActionListener {

	TextField resultField;
	Button hBtn, mBtn, sBtn;

	public void init() {
		resultField = new TextField("", 8);
		add(resultField);
		hBtn = new Button("時");
		add(hBtn);
		hBtn.addActionListener(this);
		mBtn = new Button("分");
		add(mBtn);
		mBtn.addActionListener(this);
		sBtn = new Button("秒");
		add(sBtn);
		sBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MyTime time = new MyTime(Integer.parseInt(resultField.getText()));
		if (e.getSource() == hBtn) {
			resultField.setText(String.valueOf(time.getHour()));
		} else if (e.getSource() == mBtn) {
			resultField.setText(String.valueOf(time.getMinute()));
		} else if (e.getSource() == sBtn) {
			resultField.setText(String.valueOf(time.getSecond()));
		} else {
			resultField.setText("Error...");
		}
	}
}
