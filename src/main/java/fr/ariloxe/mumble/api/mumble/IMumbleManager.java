package fr.ariloxe.mumble.api.mumble;

/**
 * @author Ariloxe
 */
public interface IMumbleManager {


    /**
     * Set a specific hostname for mumble server's node.
     */
    void setHostName(String hostName);


    /**
     * @return the node's hostname.
     */
    String getHostName();


    /**
     * Set a specific port for the mumble server.
     */
    void setPort(String defaultPort);


    /**
     * @return the server's listening port.
     */
    String getPort();


    /**
     * Create server
     */
    void createServer();

    /**
     * @return the game's channel (null if not created)
     */
    IServer getServer();


    /**
     * @return the channel of the mumble server.
     */
    IChannel getChannel();

    /**
     * @return the user who has a specific name.
     */
    IUser getUserFromName(String playerName);

    /**
     * @return the state of a user (online, offline, disconnected). ({@link MumbleState})
     */
    MumbleState getStateOf(String playerName);

    /**
     * Create a user with a specific name and password.
     */
    void createUser(String userName, String password);

}
