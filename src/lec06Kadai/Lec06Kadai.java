package lec06Kadai;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import myLengthUtil.MyLength;
import myLengthUtil.MyLengthDividedByZeroException;

public class Lec06Kadai extends Applet implements ActionListener {

	private Label feetLabel = new Label("フィート");
	private TextField feetTextField = new TextField("", 4);
	private Label inchLabel = new Label("インチ");
	private TextField inchTextField = new TextField("", 4);
	private Label divideValueLabel = new Label("割る数");
	private TextField divideValueTextField = new TextField("", 4);
	private Button eq = new Button("=");
	private TextField resultTextField = new TextField("", 20);

	public void init () {
		setLayout(new FlowLayout());
		add(feetLabel);
		add(feetTextField);
		add(inchLabel);
		add(inchTextField);
		add(divideValueLabel);
		add(divideValueTextField);
		add(eq);
		eq.addActionListener(this);
		add(resultTextField);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int feet = Integer.parseInt(feetTextField.getText());
			int inch = Integer.parseInt(inchTextField.getText());
			int divideValue = Integer.parseInt(divideValueTextField.getText());
			MyLength myLength = new MyLength(feet, inch);
			myLength.divide(divideValue);
			resultTextField.setText(myLength.getFeet() + "フィート" + myLength.getInch() + "インチ です。");
		} catch (MyLengthDividedByZeroException err) {
			resultTextField.setText("ゼロで割りました.");
		} catch (Exception err) {
			resultTextField.setText("入力文字が不正です.");
		} finally {
			feetTextField.setText("");
			inchTextField.setText("");
			divideValueTextField.setText("");
		}
	}

}
