package week3_calculator.validator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import week3_calculator.expression.Expression;
import week3_calculator.expression.Operator;
import week3_calculator.expression.Validator;

@RunWith(Parameterized.class)
public class ValidatorTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new Expression()
                        .setFirst(new BigDecimal(3))
                        .setSecond(new BigDecimal(2))
                        .setSign(Operator.PLUS)},
                {false, new Expression()
                        .setFirst(new BigDecimal(-3))
                        .setSign(Operator.PLUS)},
                {false, new Expression()
                        .setFirst(new BigDecimal(5))
                        .setSecond(new BigDecimal(-2))},
                {false, new Expression()
                        .setSecond(new BigDecimal(2))
                        .setSign(Operator.MUL)},
                {false, null}
        });
    }

    @Parameter
    public Boolean expected;

    @Parameter(1)
    public Expression input;

    @Test
    public void test() {
        Assert.assertEquals(expected, Validator.validateExp(input));
    }
}