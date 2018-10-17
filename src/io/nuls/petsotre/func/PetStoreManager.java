package io.nuls.petsotre.func;

import io.nuls.contract.sdk.Address;
import io.nuls.petsotre.model.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangkun23 on 2018/10/17.
 */
public class PetStoreManager {

    private Address owner;

    private Map<String, Pet> pets = new HashMap();

    public PetStoreManager(Address owner) {
        this.owner = owner;
    }
}
