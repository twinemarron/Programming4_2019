package lec1101;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Lec11Kadai01Frame extends Frame implements ActionListener{

	//テキストフィールド
	TextField tx;

	public Lec11Kadai01Frame(){
		//ウィンドウの"閉じる"ボタンを有効にする
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {System.exit(0);}
			}
		);

		//タイトルを設定
		setTitle("第11回授業の課題1");

		//レイアウトマネージャを設定
		setLayout( new FlowLayout() );

		//テキストフィールドの生成
		tx = new TextField("",40);
		//テキストフィールドをアクションリスナーとする
		tx.addActionListener(this);
		//テキストフィールドをフレームに登録
		add(tx);
	}

	public void actionPerformed(ActionEvent e){
		try{
			//この部分を埋めてプログラムを完成しなさい。
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Lec11Kadai01Write.txt")));
			pw.println(tx.getText());
			pw.close();
		}
		catch(IOException ie){
			tx.setText("入出力エラーです。");
		}
	}
}