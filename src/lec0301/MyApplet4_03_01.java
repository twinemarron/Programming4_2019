package lec0301;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet4_03_01 extends Applet implements ActionListener {

	Panel panel1 = new Panel(new BorderLayout());
	Button upBtn, lBtn, cBtn, rBtn;
	TextField tf;

	public void init() {
		upBtn = new Button("上");
		lBtn = new Button("左");
		cBtn = new Button("中");
		rBtn = new Button("右");
		tf = new TextField("", 20);
		panel1.add(upBtn, BorderLayout.NORTH);
		panel1.add(lBtn, BorderLayout.WEST);
		panel1.add(cBtn, BorderLayout.CENTER);
		panel1.add(rBtn, BorderLayout.EAST);
		upBtn.addActionListener(this);
		lBtn.addActionListener(this);
		cBtn.addActionListener(this);
		rBtn.addActionListener(this);
		add(panel1);
		add(tf);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText(tf.getText() + ((Button) e.getSource()).getLabel());
	}
}
