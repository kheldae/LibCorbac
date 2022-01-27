package Daeser.character;

import Daeser.ILoggable;

/**
 * Standard interface for handling economic balances attached to a character. This is the standard way to use them.
 * @author kheldae
 */
public interface IBalance extends ILoggable {
    /**
     * Standard getter for balance. This is meant to keep compatibility with the rest of the library.
     * @return The balance of money, 0 if it wasn't set.
     */
    int getBalance();

    /**
     * Standard getter for the currency name. It is important to define one to keep cohesion in your economy system. This is also meant to keep compatibility.
     * @return The currency name, a default value if not defined earlier.
     */
    String getCurrencyName();

    /**
     * Standard setter for the balance amount. It shall abort if the newfound amount is the same as the old one.
     * @param amount The new amount of money in the balance. It is set to an integer value because most tabletop RPG systems use only integer for handling this.
     */
    void setBalance(int amount);

    /**
     * Standard setter for the currency name, to keep compatibility, to keep compatibility.
     * @param name The new name for the currency. It shall not be the same as before.
     */
    void setCurrencyName(String name);
}
