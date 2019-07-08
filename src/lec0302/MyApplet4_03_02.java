package lec0302;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet4_03_02 extends Applet implements ActionListener {

	Panel panel1;
	TextField tf;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, sum, sub, mul, div, eq, dot;

	public void init () {
		panel1 = new Panel(new GridLayout(4, 4));
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
		div = new Button("/");
		eq = new Button("=");
		dot = new Button(".");
		tf = new TextField("", 20);
		panel1.add(b7);
		panel1.add(b8);
		panel1.add(b9);
		panel1.add(div);
		panel1.add(b4);
		panel1.add(b5);
		panel1.add(b6);
		panel1.add(mul);
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(sub);
		panel1.add(b0);
		panel1.add(dot);
		panel1.add(eq);
		panel1.add(sum);
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
		div.addActionListener(this);
		eq.addActionListener(this);
		dot.addActionListener(this);
		add(tf);
		add(panel1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText(tf.getText() + ((Button) e.getSource()).getLabel());
	}
}
