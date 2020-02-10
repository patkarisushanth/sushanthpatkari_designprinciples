package week3_calculator.string_parser;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import week3_calculator.expression.Expression;
import week3_calculator.expression.Operator;

public class Parser {
	private static final Map<Character,Operator> operators =new HashMap<Character,Operator>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		put('-',Operator.MINUS);
		put('+',Operator.PLUS);
		put('/',Operator.DIV);
		put('*',Operator.MUL);
	}};
	public static Expression parse(String str) {
		str=str.trim();
		String numPattern="([-+]?[0-9]*.?[0-9]+)";
		String signPattern="([//s]*[+\\-/*][//s]*)";
		Pattern pattern=Pattern.compile("^"+numPattern+signPattern+numPattern+"$");
		Matcher matcher=pattern.matcher(str);
		if(matcher.find()) {
			Expression exp = new Expression();
			exp.setFirst(new BigDecimal(matcher.group(1)));
			exp.setSecond(new BigDecimal(matcher.group(3)));
			exp.setSign(operators.get(matcher.group(2).trim().charAt(0)));
			System.out.println(exp);
			return exp;
		}
		return null;
	}
}