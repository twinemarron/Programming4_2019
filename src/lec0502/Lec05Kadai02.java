package lec0502;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lec05Kadai02 extends Applet implements ActionListener{
	TextField tf;
	int [] data = new int [5];
	int inputCount = 0;

	public void init(){
		tf = new TextField("",4);
		add(tf);
		tf.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event){
		try {
			data[inputCount] = Integer.parseInt(tf.getText());
			inputCount++;
			tf.setText("");
			if(inputCount == data.length){
				repaint();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		}
	}

	public void paint(Graphics g){
		int max = maxCalculate();
		int min = minCalculate();
		double avg = aveCalculate();
		if(inputCount != 0){
			g.drawString("最大:"+String.valueOf(max)+" 最小:"+String.valueOf(min)+" 平均:"+String.valueOf(avg), 20, 50);
		}
	}

	public int maxCalculate(){
		int max = data[0];
		for(int i=1; i<data.length; i++){
			if(data[i]>max)max=data[i];
		}
		return max;
	}

	public int minCalculate(){
		int min = data[0];
		for(int i=1; i<data.length; i++){
			if(data[i]<min)min=data[i];
		}
		return min;
	}

	public double aveCalculate(){
		double ave = 0.0;
		for(int i=0; i<data.length; i++){
			ave += data[i];
		}
		return (double)ave/data.length;
	}

}