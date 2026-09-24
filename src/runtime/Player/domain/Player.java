package runtime.Player.domain;

import runtime.Character.Hero.application.Create.HeroCreationCommand;
import runtime.Character.Hero.application.Create.HeroCreationUseCase;
import runtime.Character.Hero.domain.Hero;

import java.util.UUID;

public class Player {
    private UUID playerUuid;
    private String playerName;

    private HeroCreationUseCase heroCreationUseCase;

    public Player(UUID playerUuid, String playerName) {
        this.playerUuid = playerUuid;
        this.playerName = playerName;
    }


    public Hero createHero(String heroName, String heroType) {
        HeroCreationCommand command = new HeroCreationCommand(heroName, heroType);
        return heroCreationUseCase.execute(command);
    }

}
