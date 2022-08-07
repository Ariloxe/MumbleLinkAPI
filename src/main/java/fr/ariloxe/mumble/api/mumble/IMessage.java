package fr.ariloxe.mumble.api.mumble;

/**
 * @author Ariloxe
 */
public interface IMessage {


    /**
     * @return the specific message content.
     */
    String getMessage();

    /**
     * @return the muted message.
     */
    String getMuted();

    /**
     * @return the last message of the player.
     */
    String getLast_active();

    /**
     * @return the message's sender id.
     */
    String getUser_id();

    /**
     * @return the message's sender' username.
     */
    String getUsername();

}
