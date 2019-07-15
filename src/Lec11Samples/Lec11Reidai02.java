package Lec11Samples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lec11Reidai02 {

	public static void main(String args[]) {
		System.out.println("文字を入力してください。");

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Lec11Reidai02.txt")));
			pw.println("帝京大学理工学部");
			pw.println("情報科学科");
			pw.println("書き込み終了");
			System.out.println("ファイルに出力");
			pw.close();
		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}
		System.out.println("Done!!");

	}

}
