package lec0802;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import keisanUtil.DividedByZeroException;
import keisanUtil.Keisan;

public class Lec0802Kadai extends Frame implements ActionListener {

	private TextField tf1 = new TextField("", 6);
	private TextField tf2 = new TextField("", 6);
	private TextField tfAns = new TextField("", 30);
	private Button plusBtn = new Button("+");
	private Button minusBtn = new Button("-");
	private Button multiplyBtn = new Button("*");
	private Button divideBtn = new Button("/");

	public static void main (String args[]) {
		Lec0802Kadai lec0802Kadai = new Lec0802Kadai();
		lec0802Kadai.setSize(600, 200);
		lec0802Kadai.setVisible(true);
	}

	public Lec0802Kadai() {
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					System.exit(0);
				}
			}
		);
		setTitle("Test");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(tf1);
		add(tf2);
		add(plusBtn);
		add(minusBtn);
		add(multiplyBtn);
		add(divideBtn);
		add(tfAns);
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		multiplyBtn.addActionListener(this);
		divideBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Keisan keisan;
		String result = "";

		try {
			double val1 = Double.parseDouble(tf1.getText());
			double val2 = Double.parseDouble(tf2.getText());
			keisan = new Keisan(val1, val2);

			if (e.getSource() == plusBtn) {
				result = String.valueOf(keisan.plus());
			} else if (e.getSource() == minusBtn) {
				result = String.valueOf(keisan.minus());
			} else if (e.getSource() == multiplyBtn) {
				result = String.valueOf(keisan.multiply());
			} else if (e.getSource() == divideBtn) {
				result = String.valueOf(keisan.divide());
			}
		} catch (DividedByZeroException err) {
			result = "0で割ることはできません。";
		} catch (NumberFormatException err) {
			result = "入力した値が不正です。";
		}
		tfAns.setText(result);
	}
}
