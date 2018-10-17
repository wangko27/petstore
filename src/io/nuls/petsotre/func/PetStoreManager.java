package io.nuls.petsotre.func;

import io.nuls.contract.sdk.Address;
import io.nuls.petsotre.model.Pet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public Boolean add(String name, BigDecimal price) {
        Boolean result = false;
        if (!pets.containsKey(name)) {
            Pet pet = new Pet(name, price);
            pets.put(name, pet);
            result = true;
        }
        return result;
    }

    public List<Pet> getPets() {
        List<Pet> list = new ArrayList<Pet>();
        for (Map.Entry<String, Pet> petEntry : pets.entrySet()) {
            list.add(petEntry.getValue());
        }
        return list;
    }

    public Pet getPet(String name) {
        return pets.get(name);
    }
}
