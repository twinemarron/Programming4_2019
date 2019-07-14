package keisanUtil;

public class Keisan {
	private double operator1;
	private double operator2;

	public Keisan(double op1, double op2){
		operator1 = op1;
		operator2 = op2;
	}

	public double plus() {
		return operator1 + operator2;
	}
	public double minus() {
		return operator1 - operator2;
	}
	public double multiply() {
		return operator1 * operator2;
	}
	public double divide() throws DividedByZeroException {
		if (operator2 == 0) {
			throw new DividedByZeroException();
		}
		return operator1 / operator2;
	}
}