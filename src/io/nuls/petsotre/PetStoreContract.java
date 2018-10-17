package io.nuls.petsotre;

import io.nuls.contract.sdk.Contract;
import io.nuls.contract.sdk.annotation.Required;

import java.math.BigDecimal;

/**
 * contract
 * Created by wangkun23 on 2018/10/17.
 */
public class PetStoreContract implements Contract {

    public PetStoreContract() {

    }

    public void addPet(@Required String name, @Required BigDecimal price) {

    }

}
