package fr.ariloxe.mumble.api.mumble;

import java.util.List;

/**
 * @author Ariloxe
 */
public interface IServer {

    /**
     * @return the id of the mumble server.
     */
    int getId();

    /**
     * @return the listening port of this mumble server.
     */
    int getPort();

    /**
     * Stop the mumble server.
     */
    void stop();

    /**
     * Delete the mumble server.
     */
    void delete();

    /**
     * @return the users who are connected to this mumble server.
     */
    List<IUser> getUsers();

}
