package lec0102;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lec0102Util.Keisan;

public class MyApplet4_01_02 extends Applet implements ActionListener {

	TextField iTF1, iTF2, rTF;
	Button addBtn, subBtn, multiBtn, divBtn;

	public void init() {
		iTF1 = new TextField("", 6);
		add(iTF1);
		iTF2 = new TextField("", 6);
		add(iTF2);
		addBtn = new Button("+");
		add(addBtn);
		addBtn.addActionListener(this);
		subBtn = new Button("-");
		add(subBtn);
		subBtn.addActionListener(this);
		multiBtn = new Button("*");
		add(multiBtn);
		multiBtn.addActionListener(this);
		divBtn = new Button("/");
		add(divBtn);
		divBtn.addActionListener(this);
		add(new Label("計算結果"));
		rTF = new TextField("", 6);
		add(rTF);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double input1 = Double.parseDouble(iTF1.getText());
		double input2 = Double.parseDouble(iTF2.getText());
		Keisan keisan = new Keisan(input1, input2);

		if(e.getSource() == addBtn) {
			rTF.setText(String.valueOf(keisan.plus()));
		} else if (e.getSource() == subBtn) {
			rTF.setText(String.valueOf(keisan.minus()));
		} else if (e.getSource() == multiBtn) {
			rTF.setText(String.valueOf(keisan.multiply()));
		} else if (e.getSource() == divBtn) {
			rTF.setText(String.valueOf(keisan.divide()));
		}

	}

}
