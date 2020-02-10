package week3_calculator.expression;
import java.math.BigDecimal;

public class Expression {
	private BigDecimal first,second;
	private Operator sign;
	public BigDecimal getFirst() {
		return first;
	}
	public BigDecimal getSecond() {
		return second;
	}
	public Operator getSign() {
		return sign;
	}
	public Expression setFirst(BigDecimal first) {
			this.first=first;
			return this;
		}
	public Expression setSecond(BigDecimal second) {
		this.second=second;
		return this;
	}
	public Expression setSign(Operator sign) {
		this.sign=sign;
		return this;
	}
	public String toString() {
		return ""+first+" "+sign.getSign()+" "+second;
	}
}