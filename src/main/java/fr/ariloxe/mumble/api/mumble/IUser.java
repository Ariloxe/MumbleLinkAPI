package fr.ariloxe.mumble.api.mumble;

/**
 * @author Ariloxe
 */
public interface IUser {

    /**
     * Mute the user.
     * @return the specific message content.
     */
    IMessage unmuteUser();


    /**
     * Unmute the user.
     * @return the specific message content.
     */
    IMessage muteUser();


    /**
     * @return if the player is self-deaf.
     */
    boolean isSelfDeaf();


    /**
     * @return if the player is server-muted.
     */
    boolean isMute();

    /**
     * @return if the player is self-muted.
     */
    boolean isSelfMute();

    /**
     * Delete the user from the mumble-server.
     */
    void deleteUser();

    /**
     * @return the username.
     */
    String getName();

}
