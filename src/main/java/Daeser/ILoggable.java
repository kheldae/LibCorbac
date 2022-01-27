package Daeser;

import javax.json.JsonObject;

/**
 * @author Kheldae
 */
public interface ILoggable {
    /**
     * Method to turn the object into something a logger can manipulate to its own will.
     * @return the json version of the loggable.
     */
    JsonObject toLog();
}
