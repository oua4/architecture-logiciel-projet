package runtime.Character.Hero.domain;

import runtime.Character.Hero.domain.heroCharacteristics.Name;
import runtime.Character.Hero.domain.heroCharacteristics.Species;
import runtime.Character.Hero.domain.heroCharacteristics.Type;
import runtime.Character.Hero.domain.heroCharacteristics.Stats;

import java.util.UUID;

public class Hero {
    private UUID heroUuid;
    private Name name;
    private Species species;
    private Type type;
    private Stats stats;

    public Hero(UUID heroUuid, Name name, Species species, Type type, Stats stats) {
        this.heroUuid = heroUuid;
        this.name = name;
        this.species = species;
        this.type = type;
        this.stats = stats;
    }

    public UUID getHeroUuid() {
        return heroUuid;
    }

    public int getCurrentHp() {
        return 0;
    }
}