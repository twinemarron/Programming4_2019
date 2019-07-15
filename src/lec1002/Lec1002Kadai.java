package lec1002;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec1002Kadai extends Frame implements ActionListener {

	private MenuBar mBar = new MenuBar();
	private Menu menu = new Menu("ファイル");
	private MenuItem oItem = new MenuItem("開く Ctrl+O", new MenuShortcut('O'));
	private MenuItem qItem = new MenuItem("終了 Ctrl+X", new MenuShortcut('X'));
	private TextArea textArea = new TextArea("", 10, 100);
	int fileNum = 0;

	public Lec1002Kadai () {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});

		setTitle("ファイル名を取得する");

		setLayout(new FlowLayout());

		oItem.addActionListener(this);
		qItem.addActionListener(this);
		menu.add(oItem);
		menu.add(qItem);
		mBar.add(menu);
		setMenuBar(mBar);

		add(textArea);

	}

	public static void main(String args[]) {
		Lec1002Kadai lec1002Kadai = new Lec1002Kadai();
		lec1002Kadai.setSize(1000, 400);
		lec1002Kadai.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oItem) {
			fileNum++;
			FileDialog fDialog = new FileDialog(this, "ファイルを開く", FileDialog.LOAD);
			fDialog.setVisible(true);
			String pathName = "パス : " + fDialog.getDirectory();
			String fileName = "ファイル名 : " + fDialog.getFile();
			String newLine = fileNum + "個目のファイル : " + pathName + ", " +  fileName;
			textArea.setText( (fileNum > 1 ? textArea.getText() + "\n" : "") + newLine);  //(3)
		} else if (e.getSource() == qItem) {
			System.exit(0);
		}
	}



}
