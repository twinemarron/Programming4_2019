package Lec10Samples;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//フレームクラス
public class Lec10Smp03 extends Frame implements ActionListener {

	//テキストエリア
	private TextArea tarea = new TextArea("", 5, 40);  //(1)
	//ボタン
	private Button btn = new Button("入力");
	//テキストフィールド
	private TextField text = new TextField("", 4);

	//コンストラクタ
	public Lec10Smp03(){

		//終了ボタンを有効にする
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent evt) {System.exit(0);}
				}
		);
		//タイトルを設定する
		setTitle("ファイルダイアログを使う");
		//レイアウトマネージャを設定する
		setLayout(new FlowLayout());
		//コンポーネントを登録する
		add(text);
		add(btn);
		add(tarea);                                    //(2)
		//リスナークラスを登録する
		btn.addActionListener(this)	;
	}

	//イベントハンドラ
	public void actionPerformed(ActionEvent e) {
		//ボタンが押されると，テキストフィールドに入力されていた
		//テキストを，現在適すとエリアに表示されているテキストに
		//追加して表示する。
		//("\n"でテキストを改行している。)
		tarea.setText( tarea.getText() + "\n" + text.getText() );  //(3)
	}

	//mainメソッド
	public static void main(String args[]){
		Lec10Smp03 fm = new Lec10Smp03();
		fm.setSize(300, 400);
		fm.setVisible(true);
	}
}