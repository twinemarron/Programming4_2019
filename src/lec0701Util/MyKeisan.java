package lec0701Util;

public class MyKeisan {
	//フィールド
	private int operator1;
	private int operator2;

	//コンストラクタ
	public MyKeisan(int op1, int op2){
		operator1 = op1;
		operator2 = op2;
	}

	//メソッド
	public String plus(){
		return String.valueOf(operator1+operator2);
	}
	public String minus(){
		return String.valueOf(operator1-operator2);
	}
	public String multiply(){
		return String.valueOf(operator1*operator2);
	}
	public String divide() throws MyDividedByZeroException {
		if (operator2 == 0) {
			throw new MyDividedByZeroException();
		}
		return String.valueOf(operator1/operator2);
	}
}
