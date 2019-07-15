package Lec11Samples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lec11Reidai01 {

	public static void main(String argw[]){
		System.out.println("文字列を入力してください");

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			System.out.println();
			System.out.println(str + "が入力されました。");
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
		}

	}

}