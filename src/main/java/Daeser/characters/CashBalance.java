package Daeser.character;

import javax.json.JsonObject;

/**
 * Implementation of IBalance made to work like a cash purse. It won't be able to handle negative amounts of money, because physics.
 * This implementation of IBalance also depends of ILoggable, because
 * @author kheldae
 */
public class CashBalance implements IBalance {
    private final static String DEFAULT_UNIT = "a skeletron bone";

    private int money;
    private String currencyName;

    public CashBalance(String name, int money) {
        this.money = money;
        this.currencyName = name;
    }

    @Override
    public int getBalance() {
        return money;
    }

    @Override
    public String getCurrencyName() {
        return currencyName.trim();
    }

    @Override
    public void setBalance(int amount) {
        if(amount>=0)
            money = amount;
    }

    @Override
    public void setCurrencyName(String name) {
        if(name.isBlank())
            currencyName = DEFAULT_UNIT;
        else
            currencyName = name;
    }

    @Override
    public JsonObject toLog() {
        return null;
    }
}
