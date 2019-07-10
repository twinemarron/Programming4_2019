package lec0702;

import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lec0701Util.MyDividedByZeroException;
import lec0701Util.MyKeisan;

public class Lec0702Kadai extends Applet implements ActionListener {
	private GridLayout gridLayout = new GridLayout(4, 1);

	private TextField tf1 = new TextField("", 4);

	private Panel panel = new Panel();
	private Button plusButton = new Button("+");
	private Button minusButton = new Button("-");
	private Button multiplyButton = new Button("*");
	private Button divideButton = new Button("/");

	private TextField tf2 = new TextField("", 4);

	private Label eq = new Label("=");

	private TextField tfAns = new TextField("", 20);

	public void init () {
		setLayout(new FlowLayout());
		add(tf1);
		add(panel);
		panel.setLayout(gridLayout);
		panel.add(plusButton);
		panel.add(minusButton);
		panel.add(multiplyButton);
		panel.add(divideButton);
		plusButton.addActionListener(this);
		minusButton.addActionListener(this);
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);
		add(tf2);
		add(eq);
		add(tfAns);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int val1 = Integer.parseInt(tf1.getText());
		int val2 = Integer.parseInt(tf2.getText());

		String result = "";

		MyKeisan keisan = new MyKeisan(val1, val2);
		try {

			if (e.getSource() == plusButton) {
				result = keisan.plus();
			} else if (e.getSource() == minusButton) {
				result = keisan.minus();
			} else if (e.getSource() == multiplyButton) {
				result = keisan.multiply();
			} else if (e.getSource() == divideButton) {
				result = keisan.divide();
			}
		} catch (MyDividedByZeroException err) {
			result = "ゼロで割りました．";
		} finally {
			tfAns.setText(result);
		}
	}

}
