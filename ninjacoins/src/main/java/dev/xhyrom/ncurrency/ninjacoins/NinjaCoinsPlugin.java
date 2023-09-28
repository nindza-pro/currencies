package dev.xhyrom.ncurrency.ninjacoins;

import dev.xhyrom.lighteco.api.LightEco;
import dev.xhyrom.lighteco.api.LightEcoProvider;
import dev.xhyrom.lighteco.api.manager.CommandManager;
import dev.xhyrom.lighteco.api.manager.CurrencyManager;
import dev.xhyrom.lighteco.api.model.currency.Currency;
import org.bukkit.plugin.java.JavaPlugin;

public class NinjaCoinsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        LightEco provider = LightEcoProvider.get();
        CurrencyManager currencyManager = provider.getCurrencyManager();
        CommandManager commandManager = provider.getCommandManager();

        Currency currency = new NinjaCoinsCurrency();

        currencyManager.registerCurrency(currency);
        commandManager.registerCurrencyCommand(currency, true);
    }
}
