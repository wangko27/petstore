package io.nuls.petsotre.event;

import io.nuls.contract.sdk.Address;
import io.nuls.contract.sdk.Event;

import java.math.BigDecimal;

/**
 * Created by wangkun23 on 2018/10/17.
 */
public class BuyEvent implements Event {

    private String name;
    private BigDecimal price;
    private Address owner;

    public BuyEvent() {
    }

    public BuyEvent(String name, BigDecimal price, Address owner) {
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", owner=" + owner +
                '}';
    }
}
