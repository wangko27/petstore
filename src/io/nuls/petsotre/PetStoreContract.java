package io.nuls.petsotre;

import io.nuls.contract.sdk.Contract;
import io.nuls.contract.sdk.Msg;
import io.nuls.contract.sdk.annotation.Required;
import io.nuls.contract.sdk.annotation.View;
import io.nuls.petsotre.func.PetStoreManager;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * contract
 * Created by wangkun23 on 2018/10/17.
 */
public class PetStoreContract implements Contract {

    private PetStoreManager petStoreManager;

    public PetStoreContract() {
        petStoreManager = new PetStoreManager(Msg.sender());
    }

    @View
    public void add(@Required String name, @Required BigDecimal price) {

    }

    @View
    public void buy(@Required String petName) {

    }
}
