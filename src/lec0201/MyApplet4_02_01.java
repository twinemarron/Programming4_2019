package lec0201;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyApplet4_02_01 extends Applet implements ActionListener {

	Button upBtn, lBtn, rBtn, cBtn;
	TextField tf;

	public void init() {
		setLayout(new BorderLayout());
		upBtn = new Button("上");
		add(upBtn, BorderLayout.NORTH);
		upBtn.addActionListener(this);

		lBtn = new Button("左");
		add(lBtn, BorderLayout.WEST);
		lBtn.addActionListener(this);

		cBtn = new Button("中");
		add(cBtn, BorderLayout.CENTER);
		cBtn.addActionListener(this);

		rBtn = new Button("右");
		add(rBtn, BorderLayout.EAST);
		rBtn.addActionListener(this);

		tf = new TextField("");
		add(tf, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText(tf.getText() + ((Button) e.getSource()).getLabel());
	}

}
