package week3_calculator.calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import week3_calculator.expression.Calculator;
import week3_calculator.expression.Expression;
import week3_calculator.expression.Operator;

@RunWith(Parameterized.class)
public class CalculatorTest {
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new BigDecimal(50), new Expression()
                        .setFirst(new BigDecimal(32))
                        .setSecond(new BigDecimal(18))
                        .setSign(Operator.PLUS)},
                {new BigDecimal(-12), new Expression()
                        .setFirst(new BigDecimal(-32))
                        .setSecond(new BigDecimal(20))
                        .setSign(Operator.PLUS)},
                {new BigDecimal("3.1"), new Expression()
                        .setFirst(new BigDecimal("5.2"))
                        .setSecond(new BigDecimal("-2.1"))
                        .setSign(Operator.PLUS)},
                {new BigDecimal("12"), new Expression()
                        .setFirst(new BigDecimal(-3))
                        .setSecond(new BigDecimal(-4))
                        .setSign(Operator.MUL)},
                {new BigDecimal("0.500"), new Expression()
                        .setFirst(new BigDecimal("-2.1"))
                        .setSecond(new BigDecimal("-4.2"))
                        .setSign(Operator.DIV)},
                {new BigDecimal("2.75"), new Expression()
                        .setFirst(new BigDecimal(5))
                        .setSecond(new BigDecimal("2.25"))
                        .setSign(Operator.MINUS)}
        });
    }
	@Parameterized.Parameter
    public BigDecimal result;

    @Parameterized.Parameter(1)
    public Expression input;

    @Test
    public void test() {
        Assert.assertEquals(result, Calculator.calculateExp(input));
    }

}