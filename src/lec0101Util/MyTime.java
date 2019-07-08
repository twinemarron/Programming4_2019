package lec0101Util;

public class MyTime {
	//時間
	private int hour = 0;
	//分
	private int minute = 0;
	//秒
	private int second = 0;

	//コンストラクタ
	//MyTimeオブジェクトに値を設定する
	public MyTime( int s){
		second = s;
		minute = s/60;
		hour =  s/(60*60);
	}

	//メソッド
	//時間を返す
	public int getHour() { return hour; }
	//分を返す
	public int getMinute() { return minute; }
	//秒を返す
	public int getSecond() { return second; }

}