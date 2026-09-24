package runtime.Player.application.port;

import runtime.Player.domain.Player;

import java.util.UUID;

public interface PlayerRepository {
    public void save (Player player);

    public Player fetch(UUID uuid);

    public boolean isNameTaken(String name);
}
