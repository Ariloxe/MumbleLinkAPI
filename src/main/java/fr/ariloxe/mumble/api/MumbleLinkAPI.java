package fr.ariloxe.mumble.api;

import fr.ariloxe.mumble.api.mumble.IMumbleManager;

/**
 * @author Ariloxe
 */
public abstract class MumbleLinkAPI {

    private static MumbleLinkAPI api;

    /**
     * @return the MumbleLink's API.
     */
    public static MumbleLinkAPI getApi() {
        return api;
    }

    public static void setCoreInstance(MumbleLinkAPI api) {
        MumbleLinkAPI.api = api;
    }

    /**
     * @return the mumble manager.
     */
    public abstract IMumbleManager getMumbleManager();

}
