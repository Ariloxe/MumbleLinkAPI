package fr.ariloxe.mumble.api.mumble;

/**
 * @author Ariloxe
 */
public enum MumbleState {

    LINK("§a§l✔"),
    UNLINK("§6§l✈"),
    DISCONNECT("§c§l✖");

    private final String name;
    MumbleState(String name){
        this.name = name;
    }

    /**
     * @return get the state's prefix.
     */
    public String getName() {
        return name;
    }
}
