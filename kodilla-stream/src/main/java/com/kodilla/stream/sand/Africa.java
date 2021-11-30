package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Africa implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("31223333344445723743123521234134");
        return sandQuantity;
    }
}
