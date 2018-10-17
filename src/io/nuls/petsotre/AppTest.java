package io.nuls.petsotre;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by wangkun23 on 2018/10/17.
 */
public class AppTest {
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("100");
        BigDecimal divisor =BigDecimal.valueOf(30);
        MathContext mc=new MathContext(4, RoundingMode.CEILING);
        System.out.println(amount.divideToIntegralValue(divisor,mc));

        System.out.println(amount.plus());
    }
}
