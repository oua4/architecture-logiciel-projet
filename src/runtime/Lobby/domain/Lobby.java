package runtime.Lobby.domain;

import runtime.Lobby.domain.exceptions.NumberPlayersExceedMaximum;
import runtime.Player.domain.Player;

import java.util.ArrayList;

public class Lobby {
    private ArrayList<Player> playersInLobby = new ArrayList<>();

    public Lobby(Player player) {
        if (playersInLobby.size() <= 4) {
            playersInLobby.add(player);
        } else {
            throw new NumberPlayersExceedMaximum();
        }
    }
}
