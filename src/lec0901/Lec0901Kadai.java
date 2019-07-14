package lec0901;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lec0901Kadai extends Frame implements ActionListener {

	MenuBar mBar;
	Menu menu1, menu2;
	MenuItem menuItem11, menuItem12, menuItem21, menuItem22, menuItemQuit;
	TextField tf;

	public static void main(String args[]) {
		Lec0901Kadai frm = new Lec0901Kadai();
		frm.setSize(600, 400);
		frm.setVisible(true);
	}

	public Lec0901Kadai() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
		setTitle("Lec0901Kadaiです");
		mBar = new MenuBar();
		menu1 = new Menu("menu1");
		menu2 = new Menu("menu2");
		menuItem11 = new MenuItem("メニュー1-1 Ctrl+A", new MenuShortcut('A'));
		menuItem12 = new MenuItem("メニュー1-2 Ctrl+B", new MenuShortcut('B'));
		menuItemQuit = new MenuItem("終了 Ctrl+X", new MenuShortcut('X'));
		menuItem21 = new MenuItem("メニュー2-1 Ctrl+C", new MenuShortcut('C'));
		menuItem22 = new MenuItem("メニュー2-2 Ctrl+D", new MenuShortcut('D'));
		menu1.add(menuItem11);
		menu1.add(menuItem12);
		menu2.add(menuItemQuit);
		menu2.add(menuItem21);
		menu2.add(menuItem22);
		menuItem11.addActionListener(this);
		menuItem12.addActionListener(this);
		menuItemQuit.addActionListener(this);
		menuItem21.addActionListener(this);
		menuItem22.addActionListener(this);
		mBar.add(menu1);
		mBar.add(menu2);
		setMenuBar(mBar);
		tf = new TextField("menuが選択されていません。", 30);
		setLayout(new FlowLayout());
		add(tf);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem itm = (MenuItem)e.getSource();
		String str = "";
		if (itm == menuItem11) {
			str = "menu1-1を選びました。";
		} else if (itm == menuItem12) {
			str = "menu1-2を選びました。";
		} else if (itm == menuItem21) {
			str = "menu2-1を選びました。";
		} else if (itm == menuItem22) {
			str = "menu2-2を選びました。";
		} else if (itm == menuItemQuit) {
			System.exit(0);
		}
		tf.setText(str);
	}

}
