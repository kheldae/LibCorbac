package Daeser.character;

import java.util.HashMap;

import Daeser.ILoggable;

/**
 * This interface shall provide everything needed to create a character for any kind of RPG.
 * Every character shall have a key to identify it in the caling system, think to override the equals method !
 * @author kheldae
 */
public interface ICharacter extends ILoggable {
    /**
     * Method to modify the notes the tabletop RPG has about a character and his journey. This is used as a way to store random information about the character. 
     * @param notes The new notes of that character. It musn't be empty and be new to being changed.
     */
    void setNotes(String notes);

    /**
     * Method to add a new balance to the character. If a balance with the same characteristics already exists, the method shall abort to keep data safety.
     * @param name The name of the new balance, to keep track of it later and recognize it.
     * @param balance The concerned economic balance to add to the character.
     */
    void addBalance(String name, IBalance balance);

    /**
     * Method to get the different econmic balances of the character. This method is meant to keep compatibility with the rest of the API to handle transsactions.
     * @return An ArrayList containing all the balances of the character.
     */
    HashMap<String,IBalance> getBalances();

    /**
     * Standard getter to know what are the notes about this character. This is useful to other apps who need the information in gameplay.
     * @return The actual notes of the character, a default value if it wasn't set earlier.
     */
    String getNotes();
}
