package week3_calculator.expression;
public enum Operator {
	MINUS('-'),PLUS('+'),MUL('*'),DIV('/');
	private char sign;
	Operator(char sign){
		this.sign=sign;
	}
	public char getSign() {
		return sign;
	}
}