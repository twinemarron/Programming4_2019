package Lec11Samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lec11Reidai03 {
	public static void main(String argw[]){
		try{
			//(1) FileReader ファイル名を指定して，ファイルから読み込むための文字ストリームの作成
			//(2) BufferedReader バッファを介して読み込む
			BufferedReader br = new BufferedReader(new FileReader("Lec11Reidai02.txt"));
			//(3) 1行読み込む
			String str1 = br.readLine();
			String str2 = br.readLine();

			System.out.println("ファイルの内容は次の通りです。");
			System.out.println(str1);
			System.out.println(str2);
			//(4) ファイルをクローズ
			br.close();
		}
		catch(IOException ie){
			System.out.println("入出力エラーです。");
		}
	}
}
