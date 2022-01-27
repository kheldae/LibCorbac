package Daeser.character;

import javax.json.JsonObject;

/**
 * @author kheldae
 */
class CashBalance implements IBalance {
    private int money;
    private String currencyName;

    @Override
    public int getBalance() {
        return money;
    }

    @Override
    public String getCurrencyName() {
        return currencyName;
    }

    @Override
    public void setBalance(int amount) {
        if(amount>=0)
            money = amount;
    }

    @Override
    public void setCurrencyName(String name) {
        if(name.isBlank())
            currencyName = "a skeletron bone";
        else
            currencyName = name;
    }

    public JsonObject toLog() {
        return null;
    }
}
