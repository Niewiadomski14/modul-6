package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("3283472374327162321351234134");
        return sandQuantity;
    }
}
