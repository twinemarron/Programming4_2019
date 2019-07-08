package lec0102Util;

public class Keisan {
	private double operator1;
	private double operator2;

	//コンストラクタ
	public Keisan(double op1, double op2){
		operator1 = op1;
		operator2 = op2;
	}

	//メソッド
	public double plus(){
		return operator1+operator2;
	}
	public double minus(){
		return operator1-operator2;
	}
	public double multiply(){
		return operator1*operator2;
	}
	public double divide(){
		return operator1/operator2;
	}

}