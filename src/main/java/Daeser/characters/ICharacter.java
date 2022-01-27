package Daeser.character;

import Daeser.ILoggable;

/**
 * This interface shall provide everything needed to create a character for any kind of RPG.
 * Every character shall have a key to identify it in the caling system, think to override the equals method !
 * @author Kheldae
 */
public interface ICharacter extends ILoggable {
    /**
     * Method to modify the notes the tabletop RPG has about a character and his journey. The 
     * @param notes The new notes of that character. It musn't be empty and be new to being changed.
     */
    void setNotes(String notes);

    IBalance getBalance();
}
