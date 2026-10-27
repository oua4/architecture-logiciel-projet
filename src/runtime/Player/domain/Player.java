package runtime.Player.domain;

import java.util.UUID;

public class Player {
    private UUID playerUuid;
    private String playerName;

    public Player(UUID playerUuid, String playerName) {
        this.playerUuid = playerUuid;
        this.playerName = playerName;
    }
}