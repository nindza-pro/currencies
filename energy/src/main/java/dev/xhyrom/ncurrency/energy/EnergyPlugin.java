package dev.xhyrom.ncurrency.energy;

import dev.xhyrom.lighteco.api.LightEco;
import dev.xhyrom.lighteco.api.LightEcoProvider;
import dev.xhyrom.lighteco.api.manager.CommandManager;
import dev.xhyrom.lighteco.api.manager.CurrencyManager;
import dev.xhyrom.lighteco.api.model.currency.Currency;
import org.bukkit.plugin.java.JavaPlugin;

public class EnergyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        LightEco provider = LightEcoProvider.get();
        CurrencyManager currencyManager = provider.getCurrencyManager();
        CommandManager commandManager = provider.getCommandManager();

        Currency currency = new EnergyCurrency();

        currencyManager.registerCurrency(currency);
        commandManager.registerCurrencyCommand(currency);
    }
}
