package lec12Samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lec12Reidai01 {
	public static void main(String argw[]){
		try{
			//(1) FileReader ファイル名を指定して，ファイルから読み込むための文字ストリームの作成
			//(2) BufferedReader バッファを介して読み込む
			BufferedReader br = new BufferedReader(new FileReader("Lec12Reidai01.txt"));
			String str;
			//(3) nullになるまで，すなわちファイルの終わり(EOF;End Of File)まで読み込む
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			//(4) ファイルをクローズ
			br.close();
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
		}
	}

}