package runtime.Player.application;

import runtime.Player.application.port.PlayerRepository;
import runtime.Player.domain.Player;

import java.util.UUID;

public class CreatePlayerUseCase {
    private final PlayerRepository playerRepository;

    public CreatePlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player execute(String playerName) {
        UUID newPlayerId = UUID.randomUUID();

        Player newPlayer = new Player(newPlayerId, playerName);

        playerRepository.save(newPlayer);

        return newPlayer;
    }
}
