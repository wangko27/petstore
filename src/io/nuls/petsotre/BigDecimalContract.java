package io.nuls.petsotre;

import io.nuls.contract.sdk.Contract;
import io.nuls.contract.sdk.annotation.View;

import java.math.BigDecimal;

/**
 * contract
 * Created by wangkun23 on 2018/10/17.
 */
public class BigDecimalContract implements Contract {

    public BigDecimalContract() {

    }

    /**
     * 构造函数测试
     */
    @View
    public Boolean testConstructor() {
        BigDecimal _int = new BigDecimal(19);
        BigDecimal _double = new BigDecimal(4.56);
        BigDecimal _long = new BigDecimal(5634345L);
        BigDecimal _String = new BigDecimal("1000022");
        return Boolean.TRUE;
    }

    public Boolean test() {
        BigDecimal amount = new BigDecimal(19000);


        return Boolean.TRUE;
    }
}
