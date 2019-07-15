package Lec10Samples;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//フレームクラス
public class Lec10Smp04 extends Frame implements ActionListener {

	//メニュー
	MenuBar mbar = new MenuBar();
	Menu menu1 = new Menu("メニュー");
	MenuItem mFind = new MenuItem("検索");
	MenuItem mExit = new MenuItem("終了");

	//テキストエリア
	private TextArea text =  new TextArea(80, 30);

	//ダイアログ
	FindDialog dialogFind = new FindDialog(this, "検索", true);

	//コンストラクタ
	public Lec10Smp04(){

		//終了ボタンを有効にする
		addWindowListener(
			new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {System.exit(0);}
			}
		);

		//ウィンドウのタイトルを設定
		setTitle("検索文字を数える");

		//メニューの登録
		menu1.add(mFind);
		menu1.add(mExit);
		mbar.add(menu1);
		setMenuBar(mbar);

		//レイアウトマネージャの設定
		setLayout( new BorderLayout());
		add(text, BorderLayout.CENTER);

		//イベントリスナーの登録
		mFind.addActionListener(this);
		mExit.addActionListener(this);
	}

	//イベントハンドラ
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mFind){
			dialogFind.setVisible(true);
		}
		else if (e.getSource() == mExit){
			System.exit(0);
		}
	}

	//フレームクラスのテキストエリアのテキストを取得する
	public String getParentText(){
		return text.getText();
	}

	//mainメソッド
	public static void main(String args[]){
		Lec10Smp04 fm = new Lec10Smp04();
		fm.setSize(300, 300);
		fm.setVisible(true);
	}
}

//ダイアログクラス
//※FindDialogクラス内でフレームクラスのテキストフィールドにアクセスするため，
//  フレームクラスのメンバとして定義している
class FindDialog extends Dialog  implements ActionListener {

	//ボタン，テキストフィールド
	private Button btnOK = new Button("検索開始");
	private Button btnCancel = new Button("キャンセル");
	private TextField findText = new TextField("", 6);
	private TextField resultText = new TextField("", 6);
	private String parentText;
	Frame mainFrame;                                                 //(1)

	//コンストラクタ
	public FindDialog(Frame parent, String title, boolean modal){

		//スーパークラスのコンストラクタを呼び出す
		super(parent, title, modal);

		//ダイアログの大きさを設定
		setSize(200, 100);

		//ダイアログを閉じるボタンを有効にする
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent evt) { setVisible(false);}
				}
		);

		//ダイアログのレイアウトマネージャとしてフローレイアウトを設定
		setLayout( new GridLayout(3, 2) );

		//テキストフィールド，ボタンの登録
		add(new Label("検索文字"));
		add(findText);
		add(new Label("検索文字の個数"));
		add(resultText);
		add(btnOK);
		add(btnCancel);

		//ボタンのリスナーを登録
		btnOK.addActionListener(this);
		btnCancel.addActionListener(this);

		//メインのフレームクラスを記憶する
		mainFrame = parent;                                           //(2)
	}

	//イベントハンドラ
	public void actionPerformed(ActionEvent e) {
		//OKなら，入力されたテキストを保存し，ダイアログを閉じる
		//キャンセルなら，何もしないでダイアログを閉じる
		if (e.getSource() == btnOK){
			//検索文字を取得
			char ch = findText.getText().charAt(0);
			//検索対象テキストを取得
			//Frameクラス型からメインのフレームクラス型に型変換する。
			String st = ((Lec10Smp04)mainFrame).getParentText();      //(3)
			//検索結果(文字数)
			int count = 0;
			//文字の検索検索
			for (int i = 0; i < st.length(); i++){
				if (st.charAt(i) == ch){
					count++;
				}
			}
			//検索結果を表示
			resultText.setText( String.valueOf(count) );

			//※OKボタンが押されたときは，ダイアログを閉じない
		}
		else if (e.getSource() == btnCancel){
			//ダイアログを閉じる
			setVisible(false);
		}
	}
}
