package io.nuls.petsotre.model;

import java.math.BigDecimal;

/**
 * Created by wangkun23 on 2018/10/17.
 */
public class Pet {

    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
