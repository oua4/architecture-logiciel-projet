package src.runtime.Lobby.domain;

import src.runtime.Lobby.domain.exceptions.NumberHeroesExceedMaximum;

public class Lobby {
    private String[] lobby;

    public Lobby(String[] lobby) {
        this.lobby = lobby;

        if (lobby.length > 4) {
            throw new NumberHeroesExceedMaximum(lobby);
        }
    }
}
