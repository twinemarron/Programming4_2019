package lec0202;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet4_02_02 extends Applet implements ActionListener {

	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sum, sub, mul, dot, equ;
	TextField tf;

	public void init() {
		setLayout(new GridLayout(4, 4));

		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		sum = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		dot = new Button(".");
		equ = new Button("=");
		tf = new TextField("");
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		sum.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		dot.addActionListener(this);
		equ.addActionListener(this);
		add(b7);
		add(b8);
		add(b9);
		add(sum);
		add(b4);
		add(b5);
		add(b6);
		add(sub);
		add(b1);
		add(b2);
		add(b3);
		add(mul);
		add(b0);
		add(dot);
		add(equ);
		add(tf);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText(tf.getText() + ((Button) e.getSource()).getLabel());
	}
}
