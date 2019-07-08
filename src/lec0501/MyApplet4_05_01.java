package lec0501;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet4_05_01 extends Applet implements ActionListener {

	private TextField aTf = new TextField("", 8);
	private TextField bTf = new TextField("", 8);
	private TextField rTf = new TextField("", 20);

	private Label labelA = new Label("a");
	private Label labelB = new Label("b");

	private Button btn = new Button("a/b=");

	public void init () {
		setLayout(new FlowLayout());
		add(labelA);
		add(aTf);

		add(labelB);
		add(bTf);
		add(btn);
		add(rTf);

		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String result;

		try {
			java.lang.System.out.println("try");
			int valA = Integer.parseInt(aTf.getText());
			int valB = Integer.parseInt(bTf.getText());
			int resultVal = valA / valB;
			result = String.valueOf(resultVal);
			java.lang.System.out.println(result);

		} catch (ArithmeticException e2) {
			result = "計算できません。";
		} catch (NumberFormatException e1) {
			result = "入力された値が不正です。";
		}
		rTf.setText(result);
	}
}
