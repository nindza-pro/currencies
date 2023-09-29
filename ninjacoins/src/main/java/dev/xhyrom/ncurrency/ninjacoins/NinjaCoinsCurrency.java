package dev.xhyrom.ncurrency.ninjacoins;

import dev.xhyrom.lighteco.api.model.currency.Currency;
import dev.xhyrom.lighteco.api.model.user.User;

import java.math.BigDecimal;

public class NinjaCoinsCurrency implements Currency {
    @Override
    public String getIdentifier() {
        return "ninjacoins";
    }

    @Override
    public String[] getIdentifierAliases() {
        return new String[]{"ninjacoiny"};
    }

    @Override
    public Type getType() {
        return Type.GLOBAL;
    }

    @Override
    public boolean isPayable() {
        return true;
    }

    @Override
    public BigDecimal getDefaultBalance() {
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal calculateTax(User user, BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.2)); // 20% tax
    }
}
