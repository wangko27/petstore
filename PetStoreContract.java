package io.nuls.petsotre;

import io.nuls.contract.sdk.Address;
import io.nuls.contract.sdk.Contract;
import io.nuls.contract.sdk.Msg;
import io.nuls.contract.sdk.Utils;
import io.nuls.contract.sdk.annotation.Payable;
import io.nuls.contract.sdk.annotation.Required;
import io.nuls.contract.sdk.annotation.View;
import io.nuls.petsotre.event.BuyEvent;
import io.nuls.petsotre.func.PetStoreManager;
import io.nuls.petsotre.model.Pet;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

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
    public Boolean add(@Required String name, @Required BigDecimal price) {
        //验证 参数
        return petStoreManager.add(name, price);
    }

    @Payable
    public Boolean buy(@Required String name) {
        Pet pet = petStoreManager.getPet(name);
        if (pet == null) {
            return false;
        }
        //合约地址的费用
        BigInteger value = Msg.value();
        BigDecimal buyPrice = new BigDecimal(value);
        Address owner = Msg.sender();
//        if (buyPrice.compareTo(pet.getPrice()) != 1) {
//            //购买钱不正确
//            return false;
//        }
        BuyEvent event = new BuyEvent(pet.getName(), pet.getPrice(), owner);
        Utils.emit(event);
        return true;
    }

    @View
    public Boolean testConstructor() {
        /**
         * 构造函数测试
         */
        BigDecimal _int = new BigDecimal(19);
        BigDecimal _double = new BigDecimal(4.56);
        BigDecimal _long = new BigDecimal(5634345L);
        BigDecimal _String = new BigDecimal("1000022");
    }

    @View
    public Integer getInt() {
        return 1;
    }


    @View
    public List<Pet> getPets() {
        return petStoreManager.getPets();
    }

    @View
    public Pet getPet(String name) {
        return petStoreManager.getPet(name);
    }
}
