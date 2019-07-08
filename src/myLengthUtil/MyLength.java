package myLengthUtil;

public class MyLength {
	//フィールド
	//フィートを記憶する
	private int feet = 0;
	//インチを記憶する
	private int inch = 0;

	//コンストラクタ(1)
	public MyLength( ){
		inch = 0;
		feet = 0;
	}
	//コンストラクタ(2)
	public MyLength( int f, int i){
		feet = f + i/12;
		inch = i%12;
	}
	//コンストラクタ(3)
	public MyLength(MyLength t){
		feet = t.getFeet();
		inch = t.getInch();
	}
	//メソッド
	//MyLengthオブジェクトに値を設定する
	public void setLength( int f, int i){
		feet = f + i/12;
		inch = i%12;
	}
	//フィートを返す
	public int getFeet() { return feet; }
	//インチを返す
	public int getInch() { return inch; }
	//インチに換算した長さを返す
	public int toInch(){
		return (feet*12 + inch);
	}
	//MyLengthオブジェクト同士の加算
	public MyLength add( MyLength x){
		int f, i;
		f = feet + x.getFeet();
		i = inch + x.getInch();
		MyLength y = new MyLength();
		y.setLength( f, i);
		return y;
	}
	//MyLengthオブジェクトを整数で割る
	// ※ここにdivideメソッドを実装する
	public void divide (int y) throws MyLengthDividedByZeroException {
		if (y == 0) {
			throw new MyLengthDividedByZeroException();
		}
		java.lang.System.out.println(this.toInch());
		int dividedInchs = this.toInch() / y;
		this.setLength(dividedInchs / 12, dividedInchs % 12);
	}
}