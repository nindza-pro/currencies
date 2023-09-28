package dev.xhyrom.ncurrency.energy;

import dev.xhyrom.lighteco.api.model.currency.Currency;
import dev.xhyrom.lighteco.api.model.user.User;

import java.math.BigDecimal;

public class EnergyCurrency implements Currency {
    @Override
    public String getIdentifier() {
        return "energy";
    }

    @Override
    public Type getType() {
        return Type.LOCAL;
    }

    @Override
    public boolean isPayable() {
        return true;
    }

    @Override
    public BigDecimal getDefaultBalance() {
        return BigDecimal.ZERO;
    }
}
