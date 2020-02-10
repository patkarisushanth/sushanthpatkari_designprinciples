package week3_calculator.expression;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidParameterException;

public class Calculator {
	public static BigDecimal addition(BigDecimal first,BigDecimal second) {
		return first.add(second);
	}
	public static BigDecimal subtraction(BigDecimal first,BigDecimal second) {
		return first.subtract(second);
	}
	public static BigDecimal multiplication(BigDecimal first,BigDecimal second) {
		return first.multiply(second);
	}
	public static BigDecimal division(BigDecimal first,BigDecimal second) {
		return first.divide(second,3,RoundingMode.CEILING);
	}
	public static BigDecimal calculateExp(Expression exp) {
		if(Validator.validateExp(exp)) {
			switch(exp.getSign()) {
			case PLUS:
				return addition(exp.getFirst(),exp.getSecond());
			case MINUS:
				return subtraction(exp.getFirst(),exp.getSecond());
			case MUL:
				return multiplication(exp.getFirst(), exp.getSecond());
			case DIV:
				return division(exp.getFirst(),exp.getSecond());
			}
		}
		throw new InvalidParameterException("Invalid Expression");
	}
}