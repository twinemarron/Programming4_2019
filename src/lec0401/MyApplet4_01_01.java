package lec0401;

import java.applet.Applet;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import lec0102Util.Keisan;

public class MyApplet4_01_01 extends Applet implements ActionListener, ItemListener {

	private CardLayout card = new CardLayout();
	private Panel cardPanel = new Panel(card);
	private Panel plusPanel = new Panel();
	private Panel minusPanel = new Panel();
	private Panel multiplePanel = new Panel();
	private Panel dividePanel = new Panel();

	private TextField plusText1 = new TextField("", 8);
	private TextField plusText2 = new TextField("", 8);
	private TextField minusText1 = new TextField("", 8);
	private TextField minusText2 = new TextField("", 8);
	private TextField multipleText1 = new TextField("", 8);
	private TextField multipleText2 = new TextField("", 8);
	private TextField divideText1 = new TextField("", 8);
	private TextField divideText2 = new TextField("", 8);
	private Label plusLabel = new Label("+");
	private Label minusLabel = new Label("-");
	private Label multipleLabel = new Label("*");
	private Label divideLabel = new Label("/");

	private Button eqBtn = new Button("=");
	private TextField result = new TextField("", 6);

	private CheckboxGroup cgroup = new CheckboxGroup();
	private Checkbox plusCheckBox = new Checkbox("+", cgroup, true);
	private Checkbox minusCheckBox = new Checkbox("-", cgroup, false);
	private Checkbox multipleCheckBox = new Checkbox("*", cgroup, false);
	private Checkbox divideCheckBox = new Checkbox("/", cgroup, false);

	public void init () {
		setLayout(new GridLayout(2, 2));

		cardPanel.add(plusPanel, "plusPanel");
		cardPanel.add(minusPanel, "minusPanel");
		cardPanel.add(multiplePanel, "multiplePanel");
		cardPanel.add(dividePanel, "dividePanel");

		plusPanel.add(plusText1);
		plusPanel.add(plusLabel);
		plusPanel.add(plusText2);

		minusPanel.add(minusText1);
		minusPanel.add(minusLabel);
		minusPanel.add(minusText2);

		multiplePanel.add(multipleText1);
		multiplePanel.add(multipleLabel);
		multiplePanel.add(multipleText2);

		dividePanel.add(divideText1);
		dividePanel.add(divideLabel);
		dividePanel.add(divideText2);

		Panel eqPanel = new Panel();
		eqPanel.add(eqBtn);
		eqPanel.add(result);

		Panel operatorPanel = new Panel();
		operatorPanel.setLayout(new FlowLayout());
		operatorPanel.add(plusCheckBox);
		operatorPanel.add(minusCheckBox);
		operatorPanel.add(multipleCheckBox);
		operatorPanel.add(divideCheckBox);
		plusCheckBox.addItemListener(this);
		minusCheckBox.addItemListener(this);
		multipleCheckBox.addItemListener(this);
		divideCheckBox.addItemListener(this);

		add(cardPanel);
		add(eqPanel);
		add(operatorPanel);

		eqBtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		java.lang.System.out.println(cgroup.getSelectedCheckbox());
		Checkbox cb = cgroup.getSelectedCheckbox();
		double val1;
		double val2;
		if (cb == plusCheckBox) {
			val1 = (double)Integer.parseInt(plusText1.getText());
			val2 = (double)Integer.parseInt(plusText2.getText());
			Keisan keisan = new Keisan(val1, val2);
			result.setText(String.valueOf(keisan.plus()));
		} else if (cb == minusCheckBox) {
			val1 = (double)Integer.parseInt(minusText1.getText());
			val2 = (double)Integer.parseInt(minusText2.getText());
			Keisan keisan = new Keisan(val1, val2);
			result.setText(String.valueOf(keisan.minus()));

		} else if (cb == multipleCheckBox) {
			val1 = (double)Integer.parseInt(multipleText1.getText());
			val2 = (double)Integer.parseInt(multipleText2.getText());
			Keisan keisan = new Keisan(val1, val2);
			result.setText(String.valueOf(keisan.multiply()));

		} else if (cb == divideCheckBox) {
			val1 = (double)Integer.parseInt(divideText1.getText());
			val2 = (double)Integer.parseInt(divideText2.getText());
			Keisan keisan = new Keisan(val1, val2);
			result.setText(String.valueOf(keisan.divide()));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == plusCheckBox) {
			card.show(cardPanel, "plusPanel");
		} else if (e.getSource() == minusCheckBox) {
			card.show(cardPanel, "minusPanel");
		} else if (e.getSource() == multipleCheckBox) {
			card.show(cardPanel, "multiplePanel");
		} else if (e.getSource() == divideCheckBox) {
			card.show(cardPanel, "dividePanel");
		}
	}

}
